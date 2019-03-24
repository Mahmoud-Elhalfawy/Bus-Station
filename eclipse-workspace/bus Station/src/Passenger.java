//package com.example.android.station;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Passenger extends Person {
    private String  username;
    private String password;
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList getHistoryOfTrips() {
        return historyOfTrips;
    }

    public void setHistoryOfTrips(ArrayList historyOfTrips) {
        this.historyOfTrips = historyOfTrips;
    }

    private ArrayList historyOfTrips;
    public void booktrip(Trip trip, Vehicle vehicle){
       System.out.println(vehicle.getSeats());


//        historyOfTrips.add(trip);

    }
    public void cancelTrip(){

    }
    public void reviewTrip(Trip trip){

    }
   
    

}
