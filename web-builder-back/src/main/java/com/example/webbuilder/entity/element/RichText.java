package com.example.webbuilder.entity.element;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class RichText {


    private String richText;

    public RichText(String value) {
        this.richText = value;
    }

}
