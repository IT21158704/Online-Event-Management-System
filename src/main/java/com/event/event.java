package com.event;

public class event {
		private int id;
		private String name;
		private String discription;
		private String venue;
		private String price;
		
		public event (int id, String name, String discription, String venue,String price ) {

			this.id = id;
			this.name = name;
			this.discription = discription;
			this.venue = venue;
			this.price = price;
		}

		public int getId() {
			return id;
		}
		
		public String getName() {
			return name;
		}

		public String getDiscription() {
			return discription;
		}

		public String getVenue() {
			return venue;
		}
		
		public String getPrice() {
			return price;
		}	
}
