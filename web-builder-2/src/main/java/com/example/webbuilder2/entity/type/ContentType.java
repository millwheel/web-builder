package com.example.webbuilder2.entity.type;

import com.example.webbuilder2.generator.IdGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class ContentType {

    private long id;
    private String name;
    private List<ElementType> elementTypes;

    public static ContentType createContentType(String name){
        ContentType contentType = new ContentType();
        contentType.setId(IdGenerator.generateId());
        contentType.setName(name);
        return contentType;
    }

    public void addElementType(String name, ValueType valueType, ContentType contentType, ElementType parent){
        ElementType elementType = ElementType.createElementType(name, valueType, contentType, parent);
        this.elementTypes.add(elementType);
    }

    private void setId(long id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
}
