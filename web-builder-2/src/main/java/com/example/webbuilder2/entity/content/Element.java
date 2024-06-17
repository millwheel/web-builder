package com.example.webbuilder2.entity.content;

import com.example.webbuilder2.entity.type.ElementType;
import com.example.webbuilder2.entity.type.ValueType;
import com.example.webbuilder2.generator.IdGenerator;
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

    protected static Element createElement(String name, String label, int sort, ElementType elementType, Object value, Content content, Element parent){
        Element element = new Element();
        element.setId(IdGenerator.generateId());
        element.setName(name);
        element.setLabel(label);
        element.setSort(sort);
        element.setElementTypeId(elementType.getId());
        element.setValue(elementType, value);
        element.setContent(content);
        element.setParent(parent);
        return element;
    }

    protected void setValue(ElementType elementType, Object value){
        ValueType valueType = elementType.getValueType();
        if (valueType.equals(ValueType.COMPOSITE) || valueType.equals(ValueType.REPEATABLE)) return;

        switch (valueType){
            case SHORT_TEXT -> this.shortText = (String) value;
            case LONG_TEXT -> this.longText = (String) value;
            case RICH_TEXT -> this.richText = (String) value;
            case LINK -> this.linkId = (int) value;
            case ATTACHMENT -> this.attachmentId = (int) value;
        }
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
