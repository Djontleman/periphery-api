CREATE TYPE album_type AS ENUM (
    'LP', 'EP', 'Single', 'Live', 'Comp'
);
CREATE TABLE albums (
    id SERIAL PRIMARY KEY,
    album_name TEXT NOT NULL,
    album_type album_type NOT NULL,
    release_date DATE NOT NULL,
    album_duration TIME NOT NULL
);