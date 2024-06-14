package com.example.webbuilder.dto.console;

import com.example.webbuilder.entity.Element;
import com.example.webbuilder.entity.ElementType;
import lombok.Data;

@Data
public class ConsoleElementDto {

    private long id;
    private ElementType elementType;
    private int sort;
    private String name;
    private Object value;

    public ConsoleElementDto(Element element) {
        this.id = element.getId();
        this.elementType = element.getElementType();
        this.sort = element.getSort();
        this.name = element.getName();
        this.value = element.extractElementValue();
    }

}
