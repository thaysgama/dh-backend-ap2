package com.dh.movie.dto;

import com.dh.movie.entity.Movie;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MovieDTO {

    private Long id;
    private String name;
    private String genre;
    private String urlStream;

    public MovieDTO(Movie movie) {
        this.id = movie.getId();
        this.name = movie.getName();
        this.genre = movie.getGenre();
        this.urlStream = movie.getUrlStream();
    }
}
