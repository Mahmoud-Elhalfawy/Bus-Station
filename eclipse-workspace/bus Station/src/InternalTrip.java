//package com.example.android.station;

public class InternalTrip extends Trip implements BuyTicket {
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
