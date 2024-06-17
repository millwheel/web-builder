package com.example.webbuilder2.entity.content;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Element {

    private long id;
    private String name;
    private String label;
    private int sort;
    private long elementTypeId;

    private String shortText;
    private String longText;
    private String richText;
    private long linkId;
    private long attachmentId;
    private int number;
    private boolean bool;

    private Content content;
    private Element parent;

    protected static Element createElement(String name, String label, int sort, long elementTypeId, Content content){
        Element element = new Element();
        element.setName(name);
        element.setLabel(label);
        element.setSort(sort);
        element.setElementTypeId(elementTypeId);
        element.setContent(content);
        return element;
    }


    private void setId(long id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setLabel(String label) {
        this.label = label;
    }

    private void setSort(int sort) {
        this.sort = sort;
    }

    private void setElementTypeId(long elementTypeId) {
        this.elementTypeId = elementTypeId;
    }

    private void setShortText(String shortText) {
        this.shortText = shortText;
    }

    private void setLongText(String longText) {
        this.longText = longText;
    }

    private void setRichText(String richText) {
        this.richText = richText;
    }

    private void setLinkId(long linkId) {
        this.linkId = linkId;
    }

    private void setAttachmentId(long attachmentId) {
        this.attachmentId = attachmentId;
    }

    private void setNumber(int number) {
        this.number = number;
    }

    private void setBool(boolean bool) {
        this.bool = bool;
    }

    private void setContent(Content content) {
        this.content = content;
    }

    private void setParent(Element parent) {
        this.parent = parent;
    }
}
