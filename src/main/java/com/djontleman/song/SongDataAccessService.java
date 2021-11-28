package com.djontleman.song;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("postgresSong")
public class SongDataAccessService implements SongDAO {

    private JdbcTemplate jdbcTemplate;
    private SongRowMapper songRowMapper;

    public SongDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.songRowMapper = new SongRowMapper();
    }

    // || ====================== Read/GET ====================== ||

    @Override
    public List<Song> getAllSongs() {
        String sql = """
                SELECT * 
                FROM songs;
                """;
        return jdbcTemplate.query(sql, songRowMapper);
    }

    @Override
    public Optional<Song> getSongById(int id) {
        String sql = """
                SELECT * 
                FROM songs
                WHERE id = ?
                """;
        return jdbcTemplate.query(sql, songRowMapper, id)
                .stream()
                .findFirst();
    }

}
