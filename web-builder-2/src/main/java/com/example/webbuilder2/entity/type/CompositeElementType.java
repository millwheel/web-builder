package com.example.webbuilder2.entity.type;

import com.example.webbuilder2.generator.IdGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Getter
@NoArgsConstructor
public class CompositeElementType extends ElementType{

    private long id;
    private List<ElementType> elementsOfElement;


    protected static CompositeElementType createCompositeElementType(ElementType ...elementTypes){
        CompositeElementType compositeElementType = new CompositeElementType();
        compositeElementType.setId(IdGenerator.generateId());
        compositeElementType.elementsOfElement.addAll(Arrays.asList(elementTypes));

        return compositeElementType;
    }


    public void setId(long id) {
        this.id = id;
    }

}
