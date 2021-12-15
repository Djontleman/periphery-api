package com.djontleman.song;

import com.djontleman.album.Album;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Song {
   private int id;
   private String name;
   private LocalTime duration;
   private boolean hasMusicVideo;
   private Integer tuningId;
   @JsonIgnoreProperties({"songList", "duration"})
   private List<Album> albumsOn;

}
