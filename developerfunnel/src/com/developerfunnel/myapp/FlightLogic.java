package com.developerfunnel.myapp;

public class FlightLogic {
    public double passengers;
    public double seats;

    public void Flight(){
        seats = 150;
        passengers =0;
    }

    public String add1Passenger(){
        if(passengers < seats){
            passengers +=1;
        }else{
            handleToMany();
        }

        return "Passengerr added";
    }

    private String handleToMany(){
        return "TOo many passengers";
    }

}
