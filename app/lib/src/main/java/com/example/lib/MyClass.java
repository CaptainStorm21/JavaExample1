package com.example.lib;

import java.util.Arrays;

public class MyClass {

    // Write here your java codes
    public static void main(String[] args){
        System.out.println("hello world");

        int age = 30;
        age = 34;
        System.out.println(age);

        //primitive
        byte x = 127;
        System.out.println("byte" + x);

        int primitiveInt = 123;
        int primitiveShort = 32757;

        //long
        long primitiveLong = 32432234L;
        float primitiveFloat = 34333;
        double primitiveDouble = 32433.32;
        char primitiveChar = 324;
        boolean primitiveBool = false;

        //non primitive
        String[] cities =new String[] {"Calgary", "Toronto", "Washignton"};
        System.out.println(Arrays.toString(cities));



    }

}