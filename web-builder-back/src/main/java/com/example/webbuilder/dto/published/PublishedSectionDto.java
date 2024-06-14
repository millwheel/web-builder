package com.example.webbuilder.dto.published;

import com.example.webbuilder.entity.Section;
import com.example.webbuilder.entity.SectionType;
import lombok.Data;

import java.util.List;

@Data
public class PublishedSectionDto {

    private long id;
    private SectionType sectionType;
    private List<PublishedContentDto> contents;

    public PublishedSectionDto(Section section) {
        this.id = section.getId();
        this.sectionType = section.getSectionType();
        this.contents = section.getContents().stream().map(PublishedContentDto::new).toList();
    }
}
