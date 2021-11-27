ALTER TABLE songs
DROP COLUMN album_id;

CREATE TABLE albums_songs (
    id SERIAL PRIMARY KEY,
    album_id INT NOT NULL REFERENCES albums(id),
    song_id INT NOT NULL REFERENCES songs(id)
);