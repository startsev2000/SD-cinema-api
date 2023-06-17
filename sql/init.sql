CREATE DATABASE cinema;

CREATE TABLE movies
(
    id       SERIAL PRIMARY KEY,
    title    VARCHAR(255),
    genre    VARCHAR(255),
    duration INTEGER,
    rating   FLOAT
);

CREATE TABLE showtimes
(
    id         SERIAL PRIMARY KEY,
    movie_id   INTEGER,
    start_time TIMESTAMP,
    FOREIGN KEY (movie_id) REFERENCES movies (id)
);

CREATE TABLE tickets
(
    id          SERIAL PRIMARY KEY,
    showtime_id INTEGER,
    quantity    INTEGER,
    FOREIGN KEY (showtime_id) REFERENCES showtimes (id)
);
