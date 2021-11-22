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
    public int getCountAllAlbums() {
        String sql = """
                SELECT COUNT(*)
                FROM albums;
                """;
        int countAlbums = jdbcTemplate.queryForObject(sql, Integer.class);
        return countAlbums;
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
