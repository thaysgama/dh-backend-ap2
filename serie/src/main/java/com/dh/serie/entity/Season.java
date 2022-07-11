package com.dh.serie.entity;

import com.dh.serie.dto.ChapterDTO;
import com.dh.serie.dto.SeasonDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class Season {

    @Id
    private Long id;
    private Integer seasonNumber;
    private List<Chapter> chapters;

    public Season(SeasonDTO seasonDTO) {
        this.id = seasonDTO.getId();
        this.seasonNumber = seasonDTO.getSeasonNumber();
        this.chapters = seasonDTO.getChapters().stream()
                .map(Chapter::new)
                .collect(Collectors.toList());
    }
}
