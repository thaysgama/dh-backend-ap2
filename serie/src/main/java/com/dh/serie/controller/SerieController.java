package com.dh.serie.controller;

import com.dh.serie.dto.SerieDTO;
import com.dh.serie.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/serie")
public class SerieController {

    @Autowired
    private SerieService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SerieDTO save(@RequestBody SerieDTO serieDTO){
        return service.save(serieDTO);
    }

    @GetMapping("/{genre}")
    @ResponseStatus(HttpStatus.OK)
    public List<SerieDTO> findMovieByGenre(@PathVariable String genre){
        return service.findByGenre(genre);
    }
}
