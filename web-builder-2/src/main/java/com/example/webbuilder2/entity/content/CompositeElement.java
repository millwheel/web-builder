package com.example.webbuilder2.entity.content;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class CompositeElement extends Element {

    private long id;
    private long elementTypeCompositionId;
    private List<Element> elementsOfElement;

}
