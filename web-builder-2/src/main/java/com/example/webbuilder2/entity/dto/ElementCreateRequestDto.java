package com.example.webbuilder2.entity.dto;

import lombok.Data;

@Data
public class ElementCreateRequestDto {

    private String name;
    private String label;
    private long elementTypeId;
    private ElementCreateDto elementCreateDto;
    private Object value;

}