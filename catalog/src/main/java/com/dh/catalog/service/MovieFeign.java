package com.dh.catalog.service;

import com.dh.catalog.dto.MovieDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="MOVIE-SERVICE", url="api-gateway:8080/movie")
public interface MovieFeign {
    @RequestMapping(method = RequestMethod.GET, value = "/{genre}")
    List<MovieDTO> findMoviesByGenre(@PathVariable String genre);
}

