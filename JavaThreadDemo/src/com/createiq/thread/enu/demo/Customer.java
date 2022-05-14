package com.createiq.thread.enu.demo;

public class Customer {

	private int cusId;
	private String cusName;
	private Cakes cake;
	private String location;
	private double price;

	public Customer(int cusId, String cusName, Cakes cake, String location) {

		this.cusId = cusId;
		this.cusName = cusName;
		this.cake = cake;
		this.location = location;
		this.price = calculatePrice();
	}

	public int getCusId() {
		return cusId;
	}

	public String getCusName() {
		return cusName;
	}

	public Cakes getCake() {
		return cake;
	}

	public String getLocation() {
		return location;
	}

	public double calculatePrice() {
		switch (cake) {
		case CHOCLATECAKE:
		default:
			return 550.00;
		case BUTTERSCOTCH:
			return 750.00;
		case PINAPPLE:
			return 980.00;

		}

	}

	public double getPrice() {
		return price;
	}

}
