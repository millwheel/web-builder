package com.example.webbuilder.entity.element;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class ShortText {


    private String shortText;

    public ShortText(String value) {
        this.shortText = value;
    }

}
