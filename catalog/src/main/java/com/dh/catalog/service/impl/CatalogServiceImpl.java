package com.dh.catalog.service.impl;

import com.dh.catalog.dto.MovieDTO;
import com.dh.catalog.entity.Catalog;
import com.dh.catalog.repository.CatalogRepository;
import com.dh.catalog.service.CatalogService;
import com.dh.catalog.service.MovieFeign;
import com.dh.catalog.service.SerieFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private MovieFeign movieFeign;

    @Autowired
    private SerieFeign serieFeign;

    private CatalogRepository catalogRepository;

    @Override
    public List<MovieDTO> findMoviesByGenre(String genre) {
        return movieFeign.findMoviesByGenre(genre);
    }

    @Override
    public List<Object> findSeriesByGenre(String genre) {
        return serieFeign.findSeriesByGenre(genre);
    }

    @Override
    public List<Object> findAllByGenre(String genre) {
        List<Object> catalogList = new ArrayList<>();
        catalogList.addAll(movieFeign.findMoviesByGenre(genre));
        catalogList.addAll(serieFeign.findSeriesByGenre(genre));
        return catalogList;
    }

    @Override
    public Catalog save(Catalog object) {
        return catalogRepository.save(object);
    }

    @Override
    public List<Catalog> findAllInCatalog() {
        return catalogRepository.findAll();
    }
}
