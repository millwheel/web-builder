package com.example.webbuilder.dto.published;

import com.example.webbuilder.entity.Page;
import lombok.Data;

import java.util.List;

@Data
public class PublishedPageDto {
    private Long id;
    private String name;
    private String subUrl;
    private String pageStyle;
    private List<PublishedSectionDto> sections;

    public PublishedPageDto(Page page) {
        this.id = page.getId();
        this.name = page.getName();
        this.subUrl = page.getSubUrl();
        this.pageStyle = page.getPageStyle();
        this.sections = page.getSections().stream().map(PublishedSectionDto::new).toList();
    }
}
