package com.dh.serie.service;

import com.dh.serie.dto.SerieDTO;

import java.util.List;

public interface SerieService {
    SerieDTO save(SerieDTO serieDTO);
    List<SerieDTO> findByGenre(String genre);
}
