package com.example.webbuilder.dto.published;

import com.example.webbuilder.entity.Content;
import com.example.webbuilder.entity.ContentType;
import lombok.Data;

import java.util.List;

@Data
public class PublishedContentDto {

    private long id;
    private ContentType contentType;
    private String name;
    private int sort;
    private List<PublishedElementDto> elements;


    public PublishedContentDto(Content content) {
        this.id = content.getId();
        this.name = content.getName();
        this.sort = content.getSort();
        this.contentType = content.getContentType();
        this.elements = content.getElements().stream().map(PublishedElementDto::new).toList();
    }
}
