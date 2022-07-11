package com.dh.serie.entity;

import com.dh.serie.dto.SerieDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.stream.Collectors;


@Document(collection = "serie")
@Data
@NoArgsConstructor
public class Serie {

    @Id
    private Long id;
    private String name;
    private String genre;
    private List<Season> seasons;

    public Serie(SerieDTO serieDTO) {
        this.id = serieDTO.getId();
        this.name = serieDTO.getName();
        this.genre = serieDTO.getGenre();
        this.seasons = serieDTO.getSeasons().stream()
                .map(Season::new)
                .collect(Collectors.toList());
    }
}
