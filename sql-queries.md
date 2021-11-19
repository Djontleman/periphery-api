# SQL Queries
roomsql doesn't like some of my queries :(

## Database Setup
Database Name: peripheryapi

## Table Setup

Album Type Enum:
```
CREATE TYPE album_type AS ENUM (
    'LP', 'EP', 'Single', 'Live', 'Comp'
);
```

Albums Table:
```
CREATE TABLE albums (
    id SERIAL PRIMARY KEY,
    album_name TEXT NOT NULL,
    album_type album_type NOT NULL,
    release_date DATE NOT NULL,
    album_duration TIME NOT NULL
);
```

Labels Table:
```
CREATE TABLE labels (
    id SERIAL PRIMARY KEY,
    label_name TEXT NOT NULL
);
```

Albums-to-Labels Table:
```
CREATE TABLE albums_labels (
    id SERIAL PRIMARY KEY,
    album_id INT NOT NULL REFERENCES albums(id),
    label_id INT NOT NULL REFERENCES labels(id)
);
```

Guitar Type Enum:
```
CREATE TYPE guitar_type AS ENUM (
    '6-String', '7-String', '8-String'
);
```

Tunings Table:
```
CREATE TABLE tunings (
    id SERIAL PRIMARY KEY,
    tuning_name TEXT,
    guitar_type guitar_type NOT NULL,
    string_notes TEXT NOT NULL
);
```

Songs Table:
```
CREATE TABLE songs (
    id SERIAL PRIMARY KEY,
    song_name TEXT NOT NULL,
    song_duration TIME NOT NULL,
    album_id INT NOT NULL REFERENCES albums(id),
    has_music_video BOOL NOT NULL,
    tuning_id INT REFERENCES tunings(id)
);
```

## Table Data

Album Data:
```
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