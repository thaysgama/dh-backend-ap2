package com.dh.serie.dto;

import com.dh.serie.entity.Serie;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class SerieDTO {

    private Long id;
    private String name;
    private String genre;
    private List<SeasonDTO> seasons;

    public SerieDTO(Serie serie) {
        this.id = serie.getId();
        this.name = serie.getName();
        this.genre = serie.getGenre();
        this.seasons = serie.getSeasons().stream()
                .map(SeasonDTO::new)
                .collect(Collectors.toList());
    }

}
