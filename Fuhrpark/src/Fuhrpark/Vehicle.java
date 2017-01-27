package Fuhrpark;

public class Vehicle {

	protected String manufacturer;
	protected String color;
	protected double purchase_price;
	protected int miles;


	public Vehicle(String manufacturer, String color, double purchase_price){
		this.manufacturer = manufacturer;
		this.color = color;
		this.purchase_price = purchase_price;
    }

    public void move_forward(int miles){
		this.miles += miles;
		System.out.println("The vehicle has moved " + this.miles + " miles since ignition.");
	}

	public void leave(){
		System.out.println("You have leaved the vehicle.");
	}

}
