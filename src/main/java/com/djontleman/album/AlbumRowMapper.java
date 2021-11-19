package com.djontleman.album;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;
import java.time.ZoneId;

public class AlbumRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Album album = new Album(
                rs.getInt("id"),
                rs.getString("album_name"),
                AlbumType.valueOf(rs.getString("album_type")),
                rs.getDate("release_date").toLocalDate(),
                rs.getTime("album_duration").toLocalTime()
        );
        return album;
    }
}
