package com.example.webbuilder2.entity.type;

import com.example.webbuilder2.generator.IdGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class RepeatableElementType extends ElementType{

    private long id;
    private List<ElementType> children;

    protected static RepeatableElementType createRepeatableElementType(ElementType elementType, int count, ElementType parent){
        RepeatableElementType repeatableElementType = new RepeatableElementType();
        repeatableElementType.setId(IdGenerator.generateId());
        for (int i = 0; i < count; i++) {
            ElementType elementType1 = ElementType.createElementType(elementType.getName(), elementType.getValueType(), elementType.getContentType(), parent);
            repeatableElementType.children.add(elementType1);
        }
        return repeatableElementType;
    }

    private void setId(long id) {
        this.id = id;
    }

}