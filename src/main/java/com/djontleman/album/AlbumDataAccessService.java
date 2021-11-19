package com.djontleman.album;

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
    public List<Album> getAllAlbumsWhereAlbumType(AlbumType albumType) {
        String sql = """
                SELECT *
                FROM albums
                WHERE album_name = 'Clear';
                """;
        List<Album> albums = jdbcTemplate.query(sql, albumRowMapper);
        return albums;
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