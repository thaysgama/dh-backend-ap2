package com.dh.movie.controller;

import com.dh.movie.dto.MovieDTO;
import com.dh.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MovieDTO save(@RequestBody MovieDTO movieDTO){
        return service.save(movieDTO);
    }

    @GetMapping("/{genre}")
    @ResponseStatus(HttpStatus.OK)
    public List<MovieDTO> findMovieByGenre(@PathVariable String genre){
        return service.findByGenre(genre);
    }
}
