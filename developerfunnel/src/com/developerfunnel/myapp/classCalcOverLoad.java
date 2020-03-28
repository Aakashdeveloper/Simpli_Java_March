package com.developerfunnel.myapp;

public class classCalcOverLoad {

    public static void main(String[] args){

        MathEquationOverload[] equations = new MathEquationOverload[2];
        equations[0] = new MathEquationOverload('a', 500.0d,50.0d);
        equations[1] = new MathEquationOverload('m', 2.0d,20.0d);

        for(MathEquationOverload equation: equations){
            equation.execute();
            System.out.println(equation.result);
        }

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;

        MathEquationOverload equationOverload = new MathEquationOverload('d');
        equationOverload.execute(leftDouble, rightDouble );
        System.out.println(equationOverload.getResult());

        equationOverload.execute(leftInt,rightInt);
        System.out.println(equationOverload.getResult());

    }
}
