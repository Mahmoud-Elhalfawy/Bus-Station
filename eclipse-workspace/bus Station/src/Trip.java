//package com.example.android.station;

public abstract class Trip{
    private String source;

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getNo_of_stops() {
        return no_of_stops;
    }

    private String destination;
    private int no_of_stops;

    public Trip(String source, String destination, int no_of_stops) {
        this.source=source;
        this.destination=destination;
        this.no_of_stops=no_of_stops;
    }
}
