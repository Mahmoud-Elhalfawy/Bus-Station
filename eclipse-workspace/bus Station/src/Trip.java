//package com.example.android.station;

public abstract class Trip{
    private String source;

    public void setSource(String source) {
		this.source = source;
	}

	public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getNo_of_stops() {
        return no_of_stops;
    }

    private String destination;
    public void setDestination(String destination) {
		this.destination = destination;
	}

	private String no_of_stops;
    public void setNo_of_stops(String no_of_stops) {
		this.no_of_stops = no_of_stops;
	}

	private String tripTime;
    public void setTripTime(String tripTime) {
		this.tripTime = tripTime;
	}

	private String ticketType;
    private double tripPrice;
    
	public double getTripPrice() {
		return tripPrice;
	}

	public String getTicketType() {
		return ticketType;
	}

	public String getTripTime() {
		return tripTime;
	}

	
  
}
