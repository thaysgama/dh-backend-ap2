package com.dh.catalog.service;

import com.dh.catalog.dto.MovieDTO;
import com.dh.catalog.entity.Catalog;

import java.util.List;

public interface CatalogService {
    List<MovieDTO> findMoviesByGenre(String genre);
    List<Object> findSeriesByGenre(String genre);
    List<Object> findAllByGenre(String genre);
    Catalog save(Catalog object);
    List<Catalog> findAllInCatalog();
}
