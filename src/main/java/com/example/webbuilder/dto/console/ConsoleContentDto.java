package com.example.webbuilder.dto.console;

import com.example.webbuilder.dto.published.PublishedElementDto;
import com.example.webbuilder.entity.Content;
import com.example.webbuilder.entity.ContentType;
import lombok.Data;

import java.util.List;

@Data
public class ConsoleContentDto {

    private long id;
    private ContentType contentType;
    private String name;
    private int sort;
    private int elementCount;
    private List<ConsoleElementDto> elements;


    public ConsoleContentDto(Content content) {
        this.id = content.getId();
        this.name = content.getName();
        this.sort = content.getSort();
        this.contentType = content.getContentType();
        this.elementCount = content.getElementCount();
        this.elements = content.getElements().stream().map(ConsoleElementDto::new).toList();
    }

}
