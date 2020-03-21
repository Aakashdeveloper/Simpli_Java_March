package com.developerfunnel.myapp;

public class typeconversion {
    public static void main(String[] args) {
        long IVal = 50;
        int Ival = (int) IVal;

        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result1 = (short) byteVal;
        short result2 = (short) longVal;
        short result3 = (short)(byteVal - longVal);
        double result4 = shortVal - longVal +floatVal + doubleVal;

        System.out.println("Running");

    }
}
