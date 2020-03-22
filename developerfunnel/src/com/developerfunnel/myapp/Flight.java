package com.developerfunnel.myapp;

public class Flight {
    public static  void main(String[] args){

        FlightLogic myflight = new FlightLogic();

        myflight.passengers = 200;
        String output1 = myflight.add1Passenger();
        //String output12 = myflight.handleToMany();
        System.out.println(output1);
    }
}
