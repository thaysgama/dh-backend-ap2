package com.dh.serie.dto;

import com.dh.serie.entity.Chapter;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ChapterDTO {

    private Integer id;
    private String name;
    private String number;
    private String urlStream;

    public ChapterDTO(Chapter chapter) {
        this.id = chapter.getId();
        this.name = chapter.getName();
        this.number = chapter.getNumber();
        this.urlStream = chapter.getUrlStream();
    }
}
