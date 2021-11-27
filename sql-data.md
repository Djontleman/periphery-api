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
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Insomnia', '0:04:09', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('The Walk', '0:05:06', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Letter Experiment', '0:06:51', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Jetpacks Was Yes!', '0:03:57', true, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Light', '0:05:50', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('All New Materials', '0:05:20', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Buttersnips', '0:05:54', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Icarus Lives!', '0:04:24', true, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Totla Mad', '0:04:00', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Ow My Feelings', '0:06:06', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Zyglrox', '0:05:06', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Racecar', '0:15:23', false, null);

INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Muramasa', '0:02:51', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Have A Blast', '0:05:55', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Facepalm Mute', '0:04:54', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Ji', '0:05:15', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Scarlet', '0:04:09', true, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Luck As A Constant', '0:06:05', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Ragnarok', '0:06:36', true, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('The Gods Must Be Crazy!', '0:03:38', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Make Total Destroy', '0:04:27', true, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Erised', '0:06:13', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Epoch', '0:02:11', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Froggin'' Bullfish', '0:05:06', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Mile Zero', '0:05:31', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Masamune', '0:06:09', false, null);

INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('A Black Minute', '0:04:16', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('MK Ultra', '0:02:50', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Heavy Heart', '0:04:22', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('The Event', '0:01:45', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('The Scourge', '0:05:36', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Alpha', '0:05:31', true, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('22 Faces', '0:03:52', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Rainbow Gravity', '0:04:39', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Four Lights', '0:02:18', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Psychosphere', '0:06:16', false, null);

INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Reprise', '0:01:25', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('The Bad Thing', '0:05:54', true, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Priestess', '0:05:04', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Graveless', '0:03:56', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Hell Below', '0:03:43', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Omega', '0:11:44', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Stranger Things', '0:07:35', false, null);

INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('The Price Is Wrong', '0:03:57', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Motormouth', '0:04:50', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Marigold', '0:07:20', true, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('The Way The News Goes...', '0:05:04', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Remain Indoors', '0:06:10', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Habitual Line-Stepper', '0:06:52', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Flatline', '0:05:51', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Absolomb', '0:07:44', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Catch Fire', '0:03:54', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Prayer Position', '0:04:37', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Lune', '0:07:47', false, null);

INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Reptile', '0:16:44', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Blood Eagle', '0:05:58', true, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Chvrch Bvrner', '0:03:41', true, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Garden In The Bones', '0:05:57', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('It''s Only Smiles', '0:05:33', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Follow Your Ghost', '0:05:24', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Crush', '0:06:49', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Sentient Glow', '0:04:28', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Satellites', '0:09:25', false, null);
```

Albums-To-Songs Data:
```roomsql
INSERT INTO albums_songs (album_id, song_id)
VALUES (1, 1);
INSERT INTO albums_songs (album_id, song_id)
VALUES (1, 2);
INSERT INTO albums_songs (album_id, song_id)
VALUES (1, 3);
INSERT INTO albums_songs (album_id, song_id)
VALUES (1, 4);
INSERT INTO albums_songs (album_id, song_id)
VALUES (1, 5);
INSERT INTO albums_songs (album_id, song_id)
VALUES (1, 6);
INSERT INTO albums_songs (album_id, song_id)
VALUES (1, 7);
INSERT INTO albums_songs (album_id, song_id)
VALUES (1, 8);
INSERT INTO albums_songs (album_id, song_id)
VALUES (1, 9);
INSERT INTO albums_songs (album_id, song_id)
VALUES (1, 10);
INSERT INTO albums_songs (album_id, song_id)
VALUES (1, 11);
INSERT INTO albums_songs (album_id, song_id)
VALUES (1, 12);
```