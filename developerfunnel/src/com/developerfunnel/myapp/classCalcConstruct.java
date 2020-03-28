package com.developerfunnel.myapp;

public class classCalcConstruct {

    public static void main(String[] args){

        MathEquationConstruct[] equations = new MathEquationConstruct[2];
        equations[0] = new MathEquationConstruct('a', 500.0d,50.0d);
        equations[1] = new MathEquationConstruct('m', 2.0d,20.0d);

        for(MathEquationConstruct equation: equations){
            equation.execute();
            System.out.println(equation.result);
        }
    }
}
