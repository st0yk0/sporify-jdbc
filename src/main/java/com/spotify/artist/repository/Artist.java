package com.spotify.artist.repository;

import lombok.Data;

@Data
public class Artist {

    private int id;
    private String firstName;
    private String lastName;
    private String genre;
}
