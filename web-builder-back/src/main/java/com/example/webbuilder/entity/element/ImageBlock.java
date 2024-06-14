package com.example.webbuilder.entity.element;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ImageBlock {


    private String imageUrl;
    private H1 h1;
    private H2 h2;
    private H3 h3;
    private List<ShortText> shortTexts = new ArrayList<>();

    public ImageBlock(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void addH1(String s){
        this.h1 = new H1(s);
    }

    public void addH2(String s) { this.h2 = new H2(s); }

    public void addH3(String s) { this.h3 = new H3(s); }

    public void addShortText(String s){
        shortTexts.add(new ShortText(s));
    }

}
