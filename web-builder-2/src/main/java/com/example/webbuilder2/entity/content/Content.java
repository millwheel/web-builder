package com.example.webbuilder2.entity.content;


import com.example.webbuilder2.generator.IdGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class Content {

    private long id;
    private String name;
    private int sort;
    private long contentTypeId;
    private long sectionId;
    private List<Element> elements = new ArrayList<>();

    public static Content createContent(String name, int sort, long contentTypeId, long sectionId) {
        Content content = new Content();
        content.setId(IdGenerator.generateId());
        content.setName(name);
        content.setSort(sort);
        content.setContentTypeId(contentTypeId);
        content.setSectionId(sectionId);
        return content;
    }

    public void addElement(String name, String label, int sort, long elementTypeId){
        Element element = Element.createElement(name, label, sort, elementTypeId, this);
        this.elements.add(element);
    }

    private void setId(long id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setContentTypeId(long contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    private void setSectionId(long sectionId) {
        this.sectionId = sectionId;
    }

    private void setSort(int sort) {
        this.sort = sort;
    }

    public void addElement(Element element){
        this.elements.add(element);
    }

}
