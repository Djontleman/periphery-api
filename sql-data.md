# SQL Data

Album Data:
```roomsql
INSERT INTO albums (album_name, album_type, release_date, album_duration) 
    VALUES ('Periphery', 'LP', '2010-04-20', '01:12:52');
INSERT INTO albums (album_name, album_type, release_date, album_duration) 
    VALUES ('Periphery (Special Edition)', 'LP', '2012-02-06', '0:00:00');
INSERT INTO albums (album_name, album_type, release_date, album_duration) 
    VALUES ('Periphery II: This Time It''s Personal', 'LP', '2012-07-03', '01:09:00');
INSERT INTO albums (album_name, album_type, release_date, album_duration) 
    VALUES ('Juggernaut: Alpha', 'LP', '2015-01-27', '00:41:25');
INSERT INTO albums (album_name, album_type, release_date, album_duration) 
    VALUES ('Juggernaut: Omega', 'LP', '2015-01-27', '00:39:21');
INSERT INTO albums (album_name, album_type, release_date, album_duration) 
    VALUES ('Periphery III: Select Difficulty', 'LP', '2016-07-22', '01:04:06');
INSERT INTO albums (album_name, album_type, release_date, album_duration) 
    VALUES ('Periphery IV: Hail Stan', 'LP', '2019-04-05', '01:03:59');
INSERT INTO albums (album_name, album_type, release_date, album_duration) 
    VALUES ('Icarus EP', 'EP', '2011-04-19', '0:00:00');
INSERT INTO albums (album_name, album_type, release_date, album_duration) 
    VALUES ('Clear', 'EP', '2014-01-28', '00:29:12');
```

Tunings Data:
```roomsql
INSERT INTO tunings (tuning_name, guitar_type, string_notes)
    VALUES ('Drop C', '6-String', 'CGCFAD');
INSERT INTO tunings (tuning_name, guitar_type, string_notes)
    VALUES ('Drop G#', '7-String', 'G#D#G#C#F#A#D#');
INSERT INTO tunings (tuning_name, guitar_type, string_notes)
    VALUES ('Standard', '8-String', 'F#BEADGBE');
INSERT INTO tunings (tuning_name, guitar_type, string_notes)
    VALUES (null, '8-String', 'C#BEADGBE');
INSERT INTO tunings (tuning_name, guitar_type, string_notes)
    VALUES (null, '6-String', 'A#GCFAD');
INSERT INTO tunings (tuning_name, guitar_type, string_notes)
    VALUES (null, '6-String', 'AGCFAD');
INSERT INTO tunings (tuning_name, guitar_type, string_notes)
    VALUES (null, '7-String', 'F#D#G#C#F#A#D#');
INSERT INTO tunings (tuning_name, guitar_type, string_notes)
    VALUES ('Open Cadd9', '6-String', 'CGCEGD');
INSERT INTO tunings (tuning_name, guitar_type, string_notes)
    VALUES (null, '7-String', 'A#C#G#C#F#A#D#');
INSERT INTO tunings (tuning_name, guitar_type, string_notes)
    VALUES (null, '6-String', 'GGCFAD');
```

Songs Data:
```roomsql
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Insomnia', '0:04:09', 1, false, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('The Walk', '0:05:06', 1, false, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Letter Experiment', '0:06:51', 1, false, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Jetpacks Was Yes!', '0:03:57', 1, true, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Light', '0:05:50', 1, false, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('All New Materials', '0:05:20', 1, false, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Buttersnips', '0:05:54', 1, false, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Icarus Lives!', '0:04:24', 1, true, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Totla Mad', '0:04:00', 1, false, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Ow My Feelings', '0:06:06', 1, false, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Zyglrox', '0:05:06', 1, false, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Racecar', '0:15:23', 1, false, null);

INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Muramasa', '0:02:51', 3, false, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Have A Blast', '0:05:55', 3, false, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Facepalm Mute', '0:04:54', 3, false, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Ji', '0:05:15', 3, false, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Scarlet', '0:04:09', 3, true, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Luck As A Constant', '0:06:05', 3, false, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Ragnarok', '0:06:36', 3, true, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('The Gods Must Be Crazy!', '0:03:38', 3, false, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Make Total Destroy', '0:04:27', 3, true, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Erised', '0:06:13', 3, false, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Epoch', '0:02:11', 3, false, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Froggin'' Bullfish', '0:05:06', 3, false, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Mile Zero', '0:05:31', 3, false, null);
INSERT INTO songs (song_name, song_duration, album_id, has_music_video, tuning_id)
VALUES ('Masamune', '0:06:09', 3, false, null);
```