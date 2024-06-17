package com.example.webbuilder2.entity;


import com.example.webbuilder2.generator.IdGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class Section {

    private long id;
    private SectionType sectionType;
    private long pageId;

    public static Section createSection(SectionType sectionType, long pageId){
        Section section = new Section();
        section.setId(IdGenerator.generateId());
        section.setSectionType(sectionType);
        section.setPageId(pageId);
        return section;
    }


    private void setId(long id) {
        this.id = id;
    }

    private void setSectionType(SectionType sectionType) {
        this.sectionType = sectionType;
    }

    private void setPageId(long pageId) {
        this.pageId = pageId;
    }
}
