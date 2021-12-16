package com.djontleman.album;

import com.djontleman.label.Label;
import com.djontleman.song.Song;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Album {
    private int id;
    private String name;
    private AlbumType type;
    private LocalDate releaseDate;
    private LocalTime duration;
    @JsonIgnoreProperties("albumsOn")
    private List<Song> songList;
    private List<Label> labels;

}
