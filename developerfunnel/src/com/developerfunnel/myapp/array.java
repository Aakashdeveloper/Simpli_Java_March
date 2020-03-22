package com.developerfunnel.myapp;

public class array {

    public static void main(String[] args){
        float[] mymarks = new float[3];
        mymarks[0] = 10.0f;
        mymarks[1] = 20.0f;
        mymarks[2] = 30.0f;
        float sum = 0.0f;

        for(int i=0; i< mymarks.length; i++){
            sum += mymarks[i];
            System.out.println(mymarks[i]);
            //System.out.println(sum);
        }

        System.out.println(sum);
        //System.out.println(mymarks[0]);

        String[] city = {"London", "NewYork","Amsterdam","Delhi"};
        /*for(int i=0; i< city.length; i++){
            System.out.println(city[i]);
        }*/

        for(String mycity:city){
            System.out.println(mycity);
        }

        int[] marks = {10,20,30,40};
        int total = 0;

        for(int intialVal: marks){
            total += intialVal;
        }
        System.out.println(total);

    }
}
