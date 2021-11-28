package com.djontleman.song;

import java.time.LocalTime;
import java.util.Objects;

public class Song {
   private int id;
   private String name;
   private LocalTime duration;
   private boolean hasMusicVideo;
   private int tuningId;

    public Song(int id, String name, LocalTime duration, boolean hasMusicVideo, int tuningId) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.hasMusicVideo = hasMusicVideo;
        this.tuningId = tuningId;
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

    public int getTuningId() {
        return tuningId;
    }

    public void setTuningId(int tuningId) {
        this.tuningId = tuningId;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", hasMusicVideo=" + hasMusicVideo +
                ", tuningId=" + tuningId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return id == song.id && hasMusicVideo == song.hasMusicVideo && tuningId == song.tuningId && Objects.equals(name, song.name) && Objects.equals(duration, song.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, duration, hasMusicVideo, tuningId);
    }
}
