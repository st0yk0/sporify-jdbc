package com.spotify.user.repository;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate birthDate;
    private boolean subscription;
}
