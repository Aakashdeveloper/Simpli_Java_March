package com.developerfunnel.myapp;

public class conditions {
    public static void main(String[] args) {
        int test1 = 10;
        int test2 = 20;
        int test3 = 30;
        String text2 = "I am outside if block";

        if(test1 < test2) {
            if (test2 < test3) {
                String text1 = "I am inside if block";
                System.out.println("test one is greater");
                System.out.println("text1>>> "+text1);
            }
        }
         else {
            System.out.println("test three is greater");
        }

        //System.out.println("text1>>> "+text1);
        System.out.println("text2>>> "+text2);

        int  a = 20,b=14,c=5;
        if(a<b | b>c)
            System.out.println("a is greater than c");


        boolean click = false;
        boolean check1 = !click;
        System.out.println(check1);




        /*if(test1<test2){
            System.out.println("Test1 iis greater");
            System.out.println("Value of test1 is "+test1);
        }
        else if(test1 == test2)
            System.out.println("Test1 is equal to Test2");
        else
            System.out.println("Test2 is greater");

         */


        int myVal = 10;
        switch (myVal%3){
            case 0:
                System.out.println("Number is even");
                break;
            case 1:
                System.out.println("Number is odd");
                break;
            case 2:
                System.out.println("Remender is 2");
                break;
            default:
                System.out.println("id dont know");
        }

        String userType = "Test";
        switch(userType){
            case "Developer":
                System.out.println("Welcome developer");
                break;
            case "Sysops":
                System.out.println("Welcome sysops");
                break;
            case "Admin":
                System.out.println("Welcome Admin");
                break;
            default:
                System.out.println("You are not allowed");
        }


        int kVal = 5;
        int factorial=1;

       /* while(kVal>1){
            factorial *= kVal;
            kVal -= 1;
        }
*/
        /*while(kVal>1){
            factorial *= kVal--;
        }

        do{
            factorial *= kVal;
            kVal -= 1;
        }while(kVal>1);

        System.out.println(factorial);*/

        for(factorial=1; kVal>1; kVal -= 1){
            factorial *= kVal;
        }
        System.out.println(factorial);


        /*for(int iVal=1; iVal<100; iVal *=2){
            System.out.println(iVal);
        }*/



    }
}
