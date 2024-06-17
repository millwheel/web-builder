package com.example.webbuilder2.entity.type;

import com.example.webbuilder2.generator.IdGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ElementType {

    private long id;
    private String name;
    private ValueType valueType;

    private ContentType contentType;
    private ElementType parent;

    protected static ElementType createElementType(String name, ValueType valueType, ContentType contentType, ElementType parent){
        ElementType elementType = new ElementType();
        elementType.setId(IdGenerator.generateId());
        elementType.setName(name);
        elementType.setValueType(valueType);
        elementType.setContentType(contentType);
        elementType.setParent(parent);
        return elementType;
    }

    private void setId(long id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setValueType(ValueType valueType) {
        this.valueType = valueType;
    }

    private void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    private void setParent(ElementType parent) {
        this.parent = parent;
    }
}
