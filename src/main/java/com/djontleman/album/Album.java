package com.djontleman.album;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Album {
    private int id;
    private String name;
    private AlbumType type;
    private LocalDate releaseDate;
    private LocalTime duration;

    public Album(int id, String name, AlbumType type, LocalDate releaseDate, LocalTime duration) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.releaseDate = releaseDate;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlbumType getType() {
        return type;
    }

    public void setType(AlbumType type) {
        this.type = type;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", releaseDate=" + releaseDate +
                ", duration=" + duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return id == album.id && Objects.equals(name, album.name) && type == album.type && Objects.equals(releaseDate, album.releaseDate) && Objects.equals(duration, album.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, releaseDate, duration);
    }
}
