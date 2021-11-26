CREATE TYPE guitar_type AS ENUM (
    '6-String', '7-String', '8-String'
);

CREATE TABLE tunings (
    id SERIAL PRIMARY KEY,
    tuning_name TEXT,
    guitar_type guitar_type NOT NULL,
    string_notes TEXT NOT NULL
);