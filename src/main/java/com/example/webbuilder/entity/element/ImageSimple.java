package com.example.webbuilder.entity.element;

import lombok.Getter;

@Getter
public class ImageSimple {


    private String imageUrl;

    public ImageSimple(String imageUrl) {
        this.imageUrl = imageUrl;
    }


}
