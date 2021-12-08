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

    // || ====================== Create/POST ====================== ||

    @Override
    public int postSong(Song song) {
        String sql = """
                INSERT INTO songs
                (song_name, song_duration, has_music_video, tuning_id)
                VALUES (?, ?, ?, ?);
                """;
        return jdbcTemplate.update(
                sql,
                song.getName(), song.getDuration(), song.isHasMusicVideo(), song.getTuningId()
        );
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

    @Override
    public List<Song> getSongsByAlbumId(int id) {
        String sql = """
                SELECT * FROM songs
                INNER JOIN albums_songs ON songs.id = albums_songs.song_id
                INNER JOIN albums ON albums_songs.album_id = albums.id
                WHERE albums.id = ?;
                """;
        return jdbcTemplate.query(sql, songRowMapper, id);
    }

    // || ====================== Update/PUT ====================== ||

    @Override
    public int putSong(int id, Song song) {
        String sql = """
                UPDATE songs
                SET song_name = ?, song_duration = ?, has_music_video = ?, tuning_id = ?
                WHERE id = ?;
                """;
        return jdbcTemplate.update(
                sql,
                song.getName(), song.getDuration(), song.isHasMusicVideo(), song.getTuningId(),
                id
        );
    }

    // || ====================== Delete/DELETE ====================== ||

    @Override
    public int deleteSong(int id) {
        String sql = """
                DELETE FROM songs
                WHERE id = ?;
                """;
        return jdbcTemplate.update(sql, id);
    }
}
