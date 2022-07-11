package com.dh.movie.entity;

import com.dh.movie.dto.MovieDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String genre;
    private String urlStream;

    public Movie(MovieDTO movieDTO) {
        this.id = movieDTO.getId();
        this.name = movieDTO.getName();
        this.genre = movieDTO.getGenre();
        this.urlStream = movieDTO.getUrlStream();
    }
}
