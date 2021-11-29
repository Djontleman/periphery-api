# SQL Queries

## Database Setup
Database Name: peripheryapi

## Table Setup

Album Type Enum:
```roomsql
CREATE TYPE album_type AS ENUM (
    'LP', 'EP', 'Single', 'Live', 'Comp'
);
```

Albums Table:
```roomsql
CREATE TABLE albums (
    id SERIAL PRIMARY KEY,
    album_name TEXT NOT NULL,
    album_type album_type NOT NULL,
    release_date DATE NOT NULL,
    album_duration TIME NOT NULL
);
```

Labels Table:
```roomsql
CREATE TABLE labels (
    id SERIAL PRIMARY KEY,
    label_name TEXT NOT NULL
);
```

Albums-to-Labels Table:
```roomsql
CREATE TABLE albums_labels (
    id SERIAL PRIMARY KEY,
    album_id INT NOT NULL REFERENCES albums(id),
    label_id INT NOT NULL REFERENCES labels(id)
);
```

Guitar Type Enum:
```roomsql
CREATE TYPE guitar_type AS ENUM (
    '6-String', '7-String', '8-String'
);
```

Tunings Table:
```roomsql
CREATE TABLE tunings (
    id SERIAL PRIMARY KEY,
    tuning_name TEXT,
    guitar_type guitar_type NOT NULL,
    string_notes TEXT NOT NULL
);
```

Songs Table:
```roomsql
CREATE TABLE songs (
    id SERIAL PRIMARY KEY,
    song_name TEXT NOT NULL,
    song_duration TIME NOT NULL,
    has_music_video BOOL NOT NULL,
    tuning_id INT REFERENCES tunings(id)
);
```

Albums-To-Songs Table:
```roomsql
CREATE TABLE albums_songs (
    id SERIAL PRIMARY KEY,
    album_id INT NOT NULL REFERENCES albums(id),
    song_id INT NOT NULL REFERENCES songs(id)
);
```

## Queries: Albums
### Create/POST

Post Album:
```roomsql
INSERT 
INTO albums (album_name, album_type, release_date, album_duration)
VALUES (?, ?::album_type, ?, ?);
```

### Read/GET

Get All Albums:
```roomsql
SELECT * FROM albums;
```

Get Valid Album Types:
```roomsql
SELECT enum_range(NULL::album_type);
```
or
```roomsql
SELECT unnest(enum_range(NULL::album_type));
```

Get All Albums where Album Type:
```roomsql
SELECT * FROM albums
WHERE album_type = ?::album_type;
```

Get Count of All Albums:
```roomsql
SELECT COUNT(*) FROM albums;
```

Get Count of Albums where Album Type:
```roomsql
SELECT COUNT(*) FROM albums
WHERE album_type = ?::album_type; 
```

Get All Albums where Release Year:

Get Album By Id:
```roomsql
SELECT * FROM albums 
WHERE id = ?;
```

Get Album By Name:
```roomsql
SELECT * FROM albums
WHERE album_name = ?;
```

### Update/PUT

Put Album:
```roomsql
UPDATE albums
SET album_name = ?, album_type = ?::album_type, release_date = ?, album_duration = ?
WHERE id = ?;
```

### Delete/DELETE

Delete Album:
```roomsql
DELETE FROM albums
WHERE id = ?;
```

## Queries: Songs
### Create/POST

Post Song:
```roomsql
INSERT INTO songs
(song_name, song_duration, has_music_video, tuning_id)
VALUES (?, ?, ?, ?);
```

### Read/GET

Get All Songs:
```roomsql
SELECT * FROM songs;
```

Get Song by ID:
```roomsql
SELECT * FROM songs
WHERE id = ?
```

Get Valid Guitar Types:
```roomsql
SELECT enum_range(NULL::guitar_type);
```
or
```roomsql
SELECT unnest(enum_range(NULL::guitar_type));
```

### Update/PUT

Put Song:
```roomsql
UPDATE songs
SET song_name = ?, song_duration = ?, has_music_video = ?, tuning_id = ?
WHERE id = ?;
```