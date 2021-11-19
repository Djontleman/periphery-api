package com.djontleman.album;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("postgres")
public class AlbumDataAccessService implements AlbumDAO{

    private JdbcTemplate jdbcTemplate;

    public AlbumDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Album> getAllAlbums() {
        String sql = """
                SELECT *
                FROM albums;
                """;
        List<Album> albums = jdbcTemplate.query(sql, new AlbumRowMapper());
        return albums;
    }
}
