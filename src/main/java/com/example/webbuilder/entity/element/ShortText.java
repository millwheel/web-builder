package com.example.webbuilder.entity.element;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class ShortText {


    private String value;

    public ShortText(String value) {
        this.value = value;
    }

}
