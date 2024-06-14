package com.example.webbuilder.entity;

import com.example.webbuilder.entity.element.*;
import com.example.webbuilder.generator.IdGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class Element {

    private long id;
    private String name;
    private ElementType elementType;
    private int sort;

    private H1 h1;
    private H2 h2;
    private H3 h3;
    private LongText longText;
    private RichText richText;
    private ImageSimple imageSimple;
    private ImageBlock imageBlock;
    private NavigationBlock navigationBlock;

    public Object extractElementValue(){
        if (h1 != null) return h1;
        if (h2 != null) return h2;
        if (h3 != null) return h3;
        if (longText != null) return longText;
        if (richText != null) return richText;
        if (imageBlock != null) return imageBlock;
        if (imageSimple != null) return imageSimple;
        if (navigationBlock != null) return navigationBlock;
        return null;
    }

    public static Element createH1Element(String name, String s, int sort) {
        Element element = createElement(name, sort, ElementType.H1);
        element.setH1(new H1(s));
        return element;
    }

    public static Element createH2Element(String name, String s, int sort) {
        Element element = createElement(name, sort, ElementType.H2);
        element.setH2(new H2(s));
        return element;
    }

    public static Element createH3Element(String name, String s, int sort) {
        Element element = createElement(name, sort, ElementType.H3);
        element.setH3(new H3(s));
        return element;
    }

    public static Element createLongTextElement(String name, String s, int sort) {
        Element element = createElement(name, sort, ElementType.LONG_TEXT);
        element.setLongText(new LongText(s));
        return element;
    }

    public static Element createSimpleImageElement(String name, String imageUrl, int sort){
        Element element = createElement(name, sort, ElementType.IMAGE_SIMPLE);
        element.setImageSimple(new ImageSimple(imageUrl));
        return element;
    }

    public static Element createImageBlockElement(String name, String imageUrl, String title, List<String> shortTexts, int sort) {
        Element element = createElement(name, sort, ElementType.IMAGE_BLOCK);
        ImageBlock imageBlock = new ImageBlock(imageUrl);
        imageBlock.addH1(title);
        shortTexts.forEach(imageBlock::addShortText);
        element.setImageBlock(imageBlock);
        return element;
    }

    public static Element createNavigationElement(String name, String title, List<String> shortTexts, int sort) {
        Element element = createElement(name, sort, ElementType.NAVIGATION_BLOCK);
        NavigationBlock navigationBlock = new NavigationBlock(title);
        shortTexts.forEach(navigationBlock::addShortText);
        element.setNavigationBlock(navigationBlock);
        return element;
    }

    public static Element createNavigationElementWithImage(String name, String title, List<String> shortTexts, String imageUrl, int sort) {
        Element element = createElement(name, sort, ElementType.NAVIGATION_BLOCK);
        NavigationBlock navigationBlock = new NavigationBlock(title);
        shortTexts.forEach(navigationBlock::addShortText);
        navigationBlock.setImageUrl(imageUrl);
        element.setNavigationBlock(navigationBlock);
        return element;
    }

    private static Element createElement(String name, int sort, ElementType elementType) {
        Element element = new Element();
        element.setId(IdGenerator.generateId());
        element.setName(name);
        element.setElementType(elementType);
        element.setSort(sort);
        return element;
    }

    private void setId(long id) {
        this.id = id;
    }
    private void setName(String name) {
        this.name = name;
    }

    private void setElementType(ElementType elementType) {
        this.elementType = elementType;
    }

    private void setSort(int sort) {
        this.sort = sort;
    }

    private void setH1(H1 h1) {
        this.h1 = h1;
    }

    private void setH2(H2 h2) {
        this.h2 = h2;
    }

    private void setH3(H3 h3) {
        this.h3 = h3;
    }

    private void setLongText(LongText longText) {
        this.longText = longText;
    }

    private void setRichText(RichText richText) {
        this.richText = richText;
    }

    private void setImageSimple(ImageSimple imageSimple) {
        this.imageSimple = imageSimple;
    }

    private void setImageBlock(ImageBlock imageBlock) {
        this.imageBlock = imageBlock;
    }

    private void setNavigationBlock(NavigationBlock navigationBlock) {
        this.navigationBlock = navigationBlock;
    }
}
