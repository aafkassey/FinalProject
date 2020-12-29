package com.game.PictionaryGenerator.util;

import java.util.UUID;

public class GenerateID {
    private GenerateID(){}

    public static long getID(){
        long format = 90000;
        long number = Math.abs(UUID.randomUUID().getMostSignificantBits());
        return (number % format);
    }
}
