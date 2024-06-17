package com.example.webbuilder2.generator;

import java.security.SecureRandom;

public class IdGenerator {

    public static long generateId(){
        SecureRandom secureRandom = new SecureRandom();
        return Integer.toUnsignedLong(secureRandom.nextInt());
    }

}
