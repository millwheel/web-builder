package com.example.webbuilder2.entity.dto;

import lombok.Data;

@Data
public class ElementCreateDto {

    private String name;
    private String label;
    private ElementCreateDto elementCreateDto;
    private Object value;

}
