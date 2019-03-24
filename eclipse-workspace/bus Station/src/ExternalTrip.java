//package com.example.android.station;

public class ExternalTrip extends Trip implements BuyTicket {
    String source;
    String destination;
    int no_of_stops;
    private String ticketType;
    private double tripPrice;
    public ExternalTrip(String source, String destination, int no_of_stops,String ticketType,double tripPrice) {
        super(source, destination, no_of_stops);
        this.ticketType=ticketType;
        this.tripPrice=tripPrice;
    }

    @Override
    public void buyMiniBusTicket() {
        if(ticketType=="round") {
            tripPrice = 300;
        }
        else if(ticketType=="oneway") {
            tripPrice=200;
        }
    }

    @Override
    public void buyBusTicket() {
    	  if(ticketType=="round") {
              tripPrice = 150;
          }
          else if(ticketType=="oneway") {
              tripPrice=100;
          }
    }

    @Override
    public void buyLimosineTicket() {
    	if(ticketType=="round") {
            tripPrice = 500;
        }
        else if(ticketType=="oneway") {
            tripPrice=400;
        }
    }
    
}
