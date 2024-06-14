package com.example.webbuilder.dto.console;

import com.example.webbuilder.dto.published.PublishedContentDto;
import com.example.webbuilder.entity.Section;
import com.example.webbuilder.entity.SectionType;
import lombok.Data;

import java.util.List;

@Data
public class ConsoleSectionDto {

    private long id;
    private SectionType sectionType;
    private List<ConsoleContentDto> contents;

    public ConsoleSectionDto(Section section) {
        this.id = section.getId();
        this.sectionType = section.getSectionType();
        this.contents = section.getContents().stream().map(ConsoleContentDto::new).toList();
    }

}
