package com.example.webbuilder.entity.element;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
public class NavigationBlock {


    private H1 h1;
    private List<ShortText> shortTexts = new ArrayList<>();
    private String imageUrl;

    public NavigationBlock(String title) {
        this.h1 = new H1(title);
    }

    public void addShortText(String s){
        shortTexts.add(new ShortText(s));
    }

    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

}
