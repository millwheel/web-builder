package com.example.webbuilder.entity;


import com.example.webbuilder.generator.IdGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Getter
@NoArgsConstructor
public class Page {

    private long id;
    private String name;
    private String subUrl;
    private String pageStyle;
    private List<Section> sections = new ArrayList<>();

    public static Page createDefaultPage(String name, String subUrl, String pageStyle){
        Page page = new Page();
        page.setName(name);
        page.setId(IdGenerator.generateId());
        page.setPageStyle(pageStyle);
        page.setSubUrl(subUrl);
        return page;
    }

    public void addSection(Section section){
        this.sections.add(section);
    }

    private void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubUrl(String subUrl) {
        this.subUrl = subUrl;
    }

    private void setPageStyle(String pageStyle) {
        this.pageStyle = pageStyle;
    }
}
