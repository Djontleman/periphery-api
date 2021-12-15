CREATE TABLE albums_labels (
    id SERIAL PRIMARY KEY,
    album_id INT NOT NULL REFERENCES albums(id),
    label_id INT NOT NULL REFERENCES labels(id)
);