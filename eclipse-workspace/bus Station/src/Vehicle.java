//package com.example.android.station;

public abstract class Vehicle {
    private int seats;
    private int ID;

    public int getSeats() {
        return seats;
    }

    public int getID() {
        return ID;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public Trip getTrip() {
        return trip;
    }

    private String vehicleType;
    Trip trip;
    
}
