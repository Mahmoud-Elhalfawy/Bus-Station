//package com.example.android.station;

public class ExternalTrip extends Trip implements BuyTicket {
    String source=super.getSource();
    String destination=super.getDestination();
   String no_of_stops=super.getNo_of_stops();
    private String ticketType=super.getTicketType();
    private double tripPrice=super.getTripPrice();
    private String tripTime=super.getTripTime();
    
 
    public String getTripTime() {
		return tripTime;
	}

	public void setTripTime(String tripTime) {
		this.tripTime = tripTime;
	}

	public double getTripPrice() {
		return tripPrice;
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
