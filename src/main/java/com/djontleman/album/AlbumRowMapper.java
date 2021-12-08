package com.djontleman.album;

import com.djontleman.song.SongDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;
import java.time.ZoneId;

@Component
public class AlbumRowMapper implements RowMapper {

    private SongDAO songDAO;

    @Autowired
    public AlbumRowMapper(@Qualifier("postgresSong") SongDAO songDAO) {
        super();
        this.songDAO = songDAO;
    }

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Album album = new Album(
                rs.getInt("id"),
                rs.getString("album_name"),
                AlbumType.valueOf(rs.getString("album_type").toUpperCase()),
                rs.getDate("release_date").toLocalDate(),
                rs.getTime("album_duration").toLocalTime(),
                songDAO.getSongsByAlbumId(rs.getInt("id"))
        );
        return album;
    }
}
