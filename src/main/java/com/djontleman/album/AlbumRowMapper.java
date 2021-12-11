package com.djontleman.album;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class AlbumRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Album album = new Album(
                rs.getInt("id"),
                rs.getString("album_name"),
                AlbumType.valueOf(rs.getString("album_type").toUpperCase()),
                rs.getDate("release_date").toLocalDate(),
                rs.getTime("album_duration").toLocalTime(),
                null
        );
        return album;
    }
}
