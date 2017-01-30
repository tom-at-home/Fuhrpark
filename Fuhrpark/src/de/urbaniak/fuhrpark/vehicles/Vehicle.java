package de.urbaniak.fuhrpark.vehicles;

import de.urbaniak.fuhrpark.fleet.Fleet;

public class Vehicle {

	protected String manufacturer;
	protected String color;
	protected double purchase_price;
	protected Fleet fleet;


	public Vehicle(String manufacturer, String color, double purchase_price, Fleet fleet){
		this.manufacturer = manufacturer;
		this.color = color;
		this.purchase_price = purchase_price;
		this.fleet = fleet;
		this.fleet.addVehicle(this);
    }
	
	public String getManufacturer(){
		return this.manufacturer;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public double getPurchasePrice(){
		return this.purchase_price;
	}	
	
	

//    public void move(Parking destination){
//		System.out.println("The vehicle has moved.");
//	}

	public void leave(){
		System.out.println("You have leaved the vehicle.");
	}

}
