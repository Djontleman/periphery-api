package com.djontleman.album;

import org.junit.jupiter.params.provider.EnumSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("postgres")
public class AlbumDataAccessService implements AlbumDAO{

    private JdbcTemplate jdbcTemplate;

    public AlbumDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    AlbumRowMapper albumRowMapper = new AlbumRowMapper();

    // || ====================== Create/POST ====================== ||

    @Override
    public int postAlbum(Album album) {
        String sql = """
                INSERT 
                INTO albums (album_name, album_type, release_date, album_duration)
                VALUES (?, ?::album_type, ?, ?);
                """;
        return jdbcTemplate.update(
                sql, album.getName(), album.getType().getStringRep(), album.getReleaseDate(), album.getDuration()
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


}
