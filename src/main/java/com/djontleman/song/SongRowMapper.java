package com.djontleman.song;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class SongRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Song song = new Song(
                rs.getInt("id"),
                rs.getString("song_name"),
                rs.getTime("song_duration").toLocalTime(),
                rs.getBoolean("has_music_video"),
                rs.getInt("tuning_id"),
                null
        );
        return song;
    }
}
