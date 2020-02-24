package com.spotify.song.repository;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class Song {

    private int id;
    private String songName;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate releaseDate;
    private int songLength;
    private int artistId;
}
