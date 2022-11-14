package com.booking;

public class booking {public class event {
	
}
	private int eid;
	private String cid;
	private String type;
	private String date;
	private String discription;
	private String venue;
	
	public booking (int eid, String cid, String type, String date, String discription, String venue) {

		
		this.eid = eid;
		this.cid = cid;
		this.type = type;
		this.date = date;
		this.discription = discription;
		this.venue = venue;
	}
	
	public int getEid() {
		return eid;
	}
	
	public String getCid() {
		return cid;
	}

	public String getType() {
		return type;
	}

	public String getDate() {
		return date;
	}
	
	public String getDiscription() {
		return discription;
	}
	public String getVenue() {
		return venue;
	}
}
