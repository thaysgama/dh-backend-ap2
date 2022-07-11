package com.dh.serie.entity;

import com.dh.serie.dto.ChapterDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
public class Chapter {
    @Id
    private Integer id;
    private String name;
    private String number;
    private String urlStream;

    public Chapter(ChapterDTO chapterDTO) {
        this.id = chapterDTO.getId();
        this.name = chapterDTO.getName();
        this.number = chapterDTO.getNumber();
        this.urlStream = chapterDTO.getUrlStream();
    }
}
