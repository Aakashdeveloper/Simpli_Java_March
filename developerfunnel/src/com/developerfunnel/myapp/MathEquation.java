package com.developerfunnel.myapp;

public class MathEquation {
    public double leftVal;
    public double rightVal;
    public char opCode;
    public double result;

    public void execute(){
        switch(opCode){
            case 'a':
                result = leftVal+rightVal;
                break;
            case 's':
                result = leftVal-rightVal;
                break;
            case 'm':
                result = leftVal*rightVal;
                break;
            case 'd':
                result = leftVal/rightVal;
                break;
            default:
                System.out.println("Error - invalid opcode");
                result = 0.0d;
        }
    }
}
