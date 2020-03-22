package com.developerfunnel.myapp;

public class classCalc {
    public static void main(String[] args) {
        MathEquation equation = new MathEquation();
        equation.execute(100.0d,20.0d,'a');
        System.out.println(equation.result);
    }

    /*public static void main(String[] args){

        MathEquation[] equations = new MathEquation[2];
        equations[0] = create(100.0d, 50.0d,'a');
        equations[1] = create(20.0d, 2.0d,'m');

        for(MathEquation equation: equations){
             equation.execute();
             System.out.println(equation.result);
        }
    }

    public static MathEquation create(double leftVal, double rightVal, char opCode){
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;

        return  equation;
    }*/

}
