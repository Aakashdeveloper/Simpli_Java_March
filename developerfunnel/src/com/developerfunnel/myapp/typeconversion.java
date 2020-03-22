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

        int test1 = 10;
        int test2 = 20;

        String output = test1<test2 ? "hiii":"bie";
        int output1 = test1>test2 ? test1+test2:test1-test2;

        System.out.println("Running " + output1);

    }
}
