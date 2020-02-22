package com.spotify.song.repository;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Song {

    private int id;
    private String songName;
    private LocalDate releaseDate;
    private int songLength;
    private int artistId;
}
