//package com.example.android.station;

public class InternalTrip extends Trip implements BuyTicket {
    String source;
    String destination;
    int no_of_stops;
    private String ticketType;
    private double tripPrice;
    public InternalTrip(String source, String destination, int no_of_stops,String ticketType,double tripPrice) {
        super(source, destination, no_of_stops);
        this.ticketType=ticketType;
        this.tripPrice=tripPrice;
    }
    @Override
    public void buyMiniBusTicket() {
    //	Vehicle xmini=new MiniBus();
    	 if(ticketType=="round") {
             tripPrice = 200;
         }
         else if(ticketType=="oneway") {
             tripPrice=100;
         }
   // xmini.
    }

    @Override
    public void buyBusTicket() {
    	  if(ticketType=="round") {
              tripPrice = 100;
          }
          else if(ticketType=="oneway") {
              tripPrice=50;
          }
    }

    @Override
    public void buyLimosineTicket() {
    	if(ticketType=="round") {
            tripPrice = 400;
        }
        else if(ticketType=="oneway") {
            tripPrice=300;
        }

    }
}
