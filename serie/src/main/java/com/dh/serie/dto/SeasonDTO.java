package com.dh.serie.dto;

import com.dh.serie.entity.Season;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class SeasonDTO {

    private Long id;
    private Integer seasonNumber;
    private List<ChapterDTO> chapters;


    public SeasonDTO(Season season) {
        this.id = season.getId();
        this.seasonNumber = season.getSeasonNumber();
        this.chapters = season.getChapters().stream()
                .map(ChapterDTO::new)
                .collect(Collectors.toList());
    }
}
