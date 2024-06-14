package com.example.webbuilder.entity.element;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class LongText {


    private String value;

    public LongText(String value) {
        this.value = value;
    }

}