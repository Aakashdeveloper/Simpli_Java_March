package com.developerfunnel.myapp;

public class Main {

    public static void main(String[] args) {
        int rating = 5;

        System.out.println("This is from your developerfunnel app with rating " + rating);

        int totalMarks = 10;
        System.out.println("This is from your developerfunnel app with rating first " + totalMarks);

        rating = totalMarks;
        System.out.println("This is from your developerfunnel app with rating second " + rating);

        totalMarks = 20;
        System.out.println("This is from your developerfunnel app with rating third " + totalMarks);
        System.out.println("This is from your developerfunnel app with rating " + rating);

    };

};



