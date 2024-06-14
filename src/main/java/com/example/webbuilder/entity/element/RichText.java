package com.example.webbuilder.entity.element;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class RichText {


    private String value;

    public RichText(String value) {
        this.value = value;
    }

}
