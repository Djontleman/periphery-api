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

INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Insomnia (Instrumental)', '0:04:49', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('The Walk (Instrumental)', '0:05:05', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Letter Experiment (Instrumental)', '0:06:50', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Jetpacks Was Yes! (Instrumental)', '0:03:56', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Light (Instrumental)', '0:05:50', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('All New Materials (Instrumental)', '0:05:20', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Buttersnips (Instrumental)', '0:05:53', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Icarus Lives! (Instrumental)', '0:03:09', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Totla Mad (Instrumental)', '0:03:59', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Ow My Feelings (Instrumental)', '0:06:06', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Zyglrox (Instrumental)', '0:05:05', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Racecar (Instrumental)', '0:14:55', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Passenger', '0:03:35', false, null);

INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('New Groove (Instrumental)', '0:01:44', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Frak The Gods (Instrumental)', '0:03:31', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Jetpacks Was Yes! (V2.0)', '0:04:24', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Icarus Lives! (EP Version)', '0:03:13', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Icarus Lives! (Bulbous Remix)', '0:03:46', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Icarus Lives! (Zedd Remix)', '0:04:55', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Icarus Lives! (Petey G Remix)', '0:03:46', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Captain On (EP Version)', '0:03:11', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Eureka!', '0:05:16', false, null);

INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Overture', '0:02:11', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('The Summer Jam', '0:04:17', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Feed The Ground', '0:04:37', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Zero', '0:05:30', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('The Parade Of Ashes', '0:05:12', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Extraneous', '0:03:20', false, null);
INSERT INTO songs (song_name, song_duration, has_music_video, tuning_id)
VALUES ('Pale Aura', '0:04:39', false, null);
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

INSERT INTO albums_songs (album_id, song_id)
VALUES (3, 13);
INSERT INTO albums_songs (album_id, song_id)
VALUES (3, 14);
INSERT INTO albums_songs (album_id, song_id)
VALUES (3, 15);
INSERT INTO albums_songs (album_id, song_id)
VALUES (3, 16);
INSERT INTO albums_songs (album_id, song_id)
VALUES (3, 17);
INSERT INTO albums_songs (album_id, song_id)
VALUES (3, 18);
INSERT INTO albums_songs (album_id, song_id)
VALUES (3, 19);
INSERT INTO albums_songs (album_id, song_id)
VALUES (3, 20);
INSERT INTO albums_songs (album_id, song_id)
VALUES (3, 21);
INSERT INTO albums_songs (album_id, song_id)
VALUES (3, 22);
INSERT INTO albums_songs (album_id, song_id)
VALUES (3, 23);
INSERT INTO albums_songs (album_id, song_id)
VALUES (3, 24);
INSERT INTO albums_songs (album_id, song_id)
VALUES (3, 25);
INSERT INTO albums_songs (album_id, song_id)
VALUES (3, 26);

INSERT INTO albums_songs (album_id, song_id)
VALUES (4, 27);
INSERT INTO albums_songs (album_id, song_id)
VALUES (4, 28);
INSERT INTO albums_songs (album_id, song_id)
VALUES (4, 29);
INSERT INTO albums_songs (album_id, song_id)
VALUES (4, 30);
INSERT INTO albums_songs (album_id, song_id)
VALUES (4, 31);
INSERT INTO albums_songs (album_id, song_id)
VALUES (4, 32);
INSERT INTO albums_songs (album_id, song_id)
VALUES (4, 33);
INSERT INTO albums_songs (album_id, song_id)
VALUES (4, 34);
INSERT INTO albums_songs (album_id, song_id)
VALUES (4, 35);
INSERT INTO albums_songs (album_id, song_id)
VALUES (4, 36);

INSERT INTO albums_songs (album_id, song_id)
VALUES (5, 37);
INSERT INTO albums_songs (album_id, song_id)
VALUES (5, 38);
INSERT INTO albums_songs (album_id, song_id)
VALUES (5, 39);
INSERT INTO albums_songs (album_id, song_id)
VALUES (5, 40);
INSERT INTO albums_songs (album_id, song_id)
VALUES (5, 41);
INSERT INTO albums_songs (album_id, song_id)
VALUES (5, 42);
INSERT INTO albums_songs (album_id, song_id)
VALUES (5, 43);

INSERT INTO albums_songs (album_id, song_id)
VALUES (6, 44);
INSERT INTO albums_songs (album_id, song_id)
VALUES (6, 45);
INSERT INTO albums_songs (album_id, song_id)
VALUES (6, 46);
INSERT INTO albums_songs (album_id, song_id)
VALUES (6, 47);
INSERT INTO albums_songs (album_id, song_id)
VALUES (6, 48);
INSERT INTO albums_songs (album_id, song_id)
VALUES (6, 49);
INSERT INTO albums_songs (album_id, song_id)
VALUES (6, 50);
INSERT INTO albums_songs (album_id, song_id)
VALUES (6, 51);
INSERT INTO albums_songs (album_id, song_id)
VALUES (6, 52);
INSERT INTO albums_songs (album_id, song_id)
VALUES (6, 53);
INSERT INTO albums_songs (album_id, song_id)
VALUES (6, 54);

INSERT INTO albums_songs (album_id, song_id)
VALUES (7, 55);
INSERT INTO albums_songs (album_id, song_id)
VALUES (7, 56);
INSERT INTO albums_songs (album_id, song_id)
VALUES (7, 57);
INSERT INTO albums_songs (album_id, song_id)
VALUES (7, 58);
INSERT INTO albums_songs (album_id, song_id)
VALUES (7, 59);
INSERT INTO albums_songs (album_id, song_id)
VALUES (7, 60);
INSERT INTO albums_songs (album_id, song_id)
VALUES (7, 61);
INSERT INTO albums_songs (album_id, song_id)
VALUES (7, 62);
INSERT INTO albums_songs (album_id, song_id)
VALUES (7, 63);

INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 1);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 2);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 3);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 4);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 5);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 6);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 7);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 8);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 9);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 10);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 11);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 12);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 64);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 65);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 66);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 67);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 68);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 69);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 70);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 71);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 72);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 73);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 74);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 75);
INSERT INTO albums_songs (album_id, song_id)
VALUES (2, 76);

INSERT INTO albums_songs (album_id, song_id)
VALUES (8, 77);
INSERT INTO albums_songs (album_id, song_id)
VALUES (8, 78);
INSERT INTO albums_songs (album_id, song_id)
VALUES (8, 79);
INSERT INTO albums_songs (album_id, song_id)
VALUES (8, 80);
INSERT INTO albums_songs (album_id, song_id)
VALUES (8, 81);
INSERT INTO albums_songs (album_id, song_id)
VALUES (8, 82);
INSERT INTO albums_songs (album_id, song_id)
VALUES (8, 83);
INSERT INTO albums_songs (album_id, song_id)
VALUES (8, 84);
INSERT INTO albums_songs (album_id, song_id)
VALUES (8, 85);

INSERT INTO albums_songs (album_id, song_id)
VALUES (9, 86);
INSERT INTO albums_songs (album_id, song_id)
VALUES (9, 87);
INSERT INTO albums_songs (album_id, song_id)
VALUES (9, 88);
INSERT INTO albums_songs (album_id, song_id)
VALUES (9, 89);
INSERT INTO albums_songs (album_id, song_id)
VALUES (9, 90);
INSERT INTO albums_songs (album_id, song_id)
VALUES (9, 91);
INSERT INTO albums_songs (album_id, song_id)
VALUES (9, 92);

```