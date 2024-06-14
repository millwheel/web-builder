package com.example.webbuilder.generator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdGeneratorTest {

    @Test
    public void generateIdTest(){
        long l = IdGenerator.generateId();
        System.out.println(l);
    }

}