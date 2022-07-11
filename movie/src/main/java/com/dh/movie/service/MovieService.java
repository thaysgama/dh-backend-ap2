package com.dh.movie.service;

import com.dh.movie.dto.MovieDTO;

import java.util.List;

public interface MovieService {
    MovieDTO save(MovieDTO movieDTO);
    List<MovieDTO> findByGenre(String genre);
}
