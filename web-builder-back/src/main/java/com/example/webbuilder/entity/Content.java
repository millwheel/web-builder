package com.example.webbuilder.entity;

import com.example.webbuilder.generator.IdGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class Content {

    private long id;
    private String name;
    private ContentType contentType;
    private int sort;
    private int elementCount;
    private List<Element> elements = new ArrayList<>();

    public static Content createContent(String name, ContentType contentType, int elementCount, int sort) {
        Content content = new Content();
        content.setId(IdGenerator.generateId());
        content.setName(name);
        content.setSort(sort);
        content.setContentType(contentType);
        content.setElementCount(elementCount);
        return content;
    }

    private void setId(long id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    private void setSort(int sort) {
        this.sort = sort;
    }

    private void setElementCount(int elementCount) {
        this.elementCount = elementCount;
    }

    public void addElement(Element element){
        this.elements.add(element);
    }

}
