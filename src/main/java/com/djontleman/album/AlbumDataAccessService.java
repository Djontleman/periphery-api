package com.djontleman.album;

import org.junit.jupiter.params.provider.EnumSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("postgresAlbum")
public class AlbumDataAccessService implements AlbumDAO{

    private JdbcTemplate jdbcTemplate;
    private AlbumRowMapper albumRowMapper;

    @Autowired
    public AlbumDataAccessService(JdbcTemplate jdbcTemplate, AlbumRowMapper albumRowMapper) {
        this.jdbcTemplate = jdbcTemplate;
        this.albumRowMapper = albumRowMapper;
    }

    // || ====================== Create/POST ====================== ||

    @Override
    public int postAlbum(Album album) {
        String sql = """
                INSERT 
                INTO albums (album_name, album_type, release_date)
                VALUES (?, ?::album_type, ?, ?);
                """;
        return jdbcTemplate.update(
                sql, album.getName(), album.getType().getStringRep(), album.getReleaseDate()
        );
    }

    // || ====================== Read/GET ====================== ||

    @Override
    public List<Album> getAllAlbums() {
        String sql = """
                SELECT *
                FROM albums;
                """;
        List<Album> albums = jdbcTemplate.query(sql, albumRowMapper);
        return albums;
    }

    @Override
//    @EnumSource(value = AlbumType.class)
    public List<Album> getAllAlbumsWhereAlbumType(AlbumType albumType) {
        String sql = """
                SELECT *
                FROM albums
                WHERE album_type = ?::album_type;
                """;
        List<Album> albums = jdbcTemplate.query(sql, albumRowMapper, albumType.getStringRep());
        return albums;
    }

    @Override
    public int getCountAllAlbums() {
        String sql = """
                SELECT COUNT(*)
                FROM albums;
                """;
        int countAlbums = jdbcTemplate.queryForObject(sql, Integer.class);
        return countAlbums;
    }

    @Override
    public int getCountAlbumsWhereAlbumType(AlbumType albumType) {
        String sql = """
                SELECT COUNT(*)
                FROM albums
                WHERE album_type = ?::album_type;
                """;
        int countAlbums = jdbcTemplate.queryForObject(sql, Integer.class, albumType.getStringRep());
        return countAlbums;
    }

    @Override
    public Optional<Album> getAlbumById(int id) {
        String sql = """
                SELECT *
                FROM albums
                WHERE id = ?;
                """;
        Optional<Album> album = jdbcTemplate.query(sql, albumRowMapper, id)
                .stream()
                .findFirst();
        return album;
    }

    @Override
    public List<Album> getAlbumsBySongId(int id) {
        String sql = """
                SELECT * FROM albums
                INNER JOIN albums_songs ON albums.id = albums_songs.album_id
                WHERE albums_songs.song_id = ?;
                """;
        return jdbcTemplate.query(sql, albumRowMapper, id);
    }

    // || ====================== Update/PUT/PATCH ====================== ||

    @Override
    public int putAlbum(int id, Album album) {
        String sql = """
                UPDATE albums
                SET album_name = ?, album_type = ?::album_type, release_date = ?
                WHERE id = ?;
                """;
        return jdbcTemplate.update(
                sql,
                album.getName(), album.getType().getStringRep(), album.getReleaseDate(),
                id);
    }

    // || ====================== Delete/DELETE ====================== ||

    @Override
    public int deleteAlbum(int id) {
        String sql = """
                DELETE FROM albums
                WHERE id = ?;
                """;
        return jdbcTemplate.update(sql, id);
    }
}
