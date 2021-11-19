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
    album_duration TIME,
    label TEXT
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
    song_duration TIME,
    album_id INT NOT NULL REFERENCES albums(id),
    has_music_video BOOL NOT NULL,
    tuning_id INT REFERENCES tunings(id)
);
```

## Table Data
