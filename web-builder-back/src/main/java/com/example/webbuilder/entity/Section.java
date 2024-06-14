package com.example.webbuilder.entity;

import com.example.webbuilder.generator.IdGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class Section {

    private long id;
    private SectionType sectionType;
    private List<Content> contents = new ArrayList<>();

    public static Section createSection(SectionType sectionType){
        Section section = new Section();
        section.setId(IdGenerator.generateId());
        section.setSectionType(sectionType);
        return section;
    }


    private void setId(long id) {
        this.id = id;
    }

    private void setSectionType(SectionType sectionType) {
        this.sectionType = sectionType;
    }

    public void addContent(Content content){
        this.contents.add(content);
    }
}
