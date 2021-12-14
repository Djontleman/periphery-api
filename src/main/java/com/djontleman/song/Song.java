package com.djontleman.song;

import com.djontleman.album.Album;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

public class Song {
   private int id;
   private String name;
   private LocalTime duration;
   private boolean hasMusicVideo;
   private Integer tuningId;
   @JsonIgnoreProperties({"songList", "duration"})
   private List<Album> albumsOn;

    public Song(int id, String name, LocalTime duration, boolean hasMusicVideo, Integer tuningId, List<Album> albumsOn) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.hasMusicVideo = hasMusicVideo;
        this.tuningId = tuningId;
        this.albumsOn = albumsOn;
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

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public boolean isHasMusicVideo() {
        return hasMusicVideo;
    }

    public void setHasMusicVideo(boolean hasMusicVideo) {
        this.hasMusicVideo = hasMusicVideo;
    }

    public Integer getTuningId() {
        return tuningId;
    }

    public void setTuningId(Integer tuningId) {
        this.tuningId = tuningId;
    }

    public List<Album> getAlbumsOn() {
        return albumsOn;
    }

    public void setAlbumsOn(List<Album> albumsOn) {
        this.albumsOn = albumsOn;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", hasMusicVideo=" + hasMusicVideo +
                ", tuningId=" + tuningId +
                ", albumsOn=" + albumsOn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return id == song.id && hasMusicVideo == song.hasMusicVideo && Objects.equals(name, song.name) && Objects.equals(duration, song.duration) && Objects.equals(tuningId, song.tuningId) && Objects.equals(albumsOn, song.albumsOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, duration, hasMusicVideo, tuningId, albumsOn);
    }
}
