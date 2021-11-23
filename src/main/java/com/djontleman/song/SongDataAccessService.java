package com.djontleman.song;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("postgresSong")
public class SongDataAccessService implements SongDAO {

    private JdbcTemplate jdbcTemplate;
    private SongRowMapper songRowMapper;

    public SongDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.songRowMapper = new SongRowMapper();
    }

    @Override
    public List<Song> getAllSongs() {
        String sql = """
                SELECT * 
                FROM songs;
                """;
        return jdbcTemplate.query(sql, songRowMapper);
    }

}
