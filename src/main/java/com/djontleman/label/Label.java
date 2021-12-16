package com.djontleman.label;

import com.djontleman.album.Album;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Label {

    private int id;
    private String name;
    @JsonIgnoreProperties("labels")
    private List<Album> albumList;

}
