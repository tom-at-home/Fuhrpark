package Fuhrpark;

public class Vehicle {

	protected String manufacturer;
	protected String color;
	public double purchase_price;
	protected Fleet fleet;


	public Vehicle(String manufacturer, String color, double purchase_price, Fleet fleet){
		this.manufacturer = manufacturer;
		this.color = color;
		this.purchase_price = purchase_price;
		this.fleet = fleet;
		this.fleet.addVehicle(this);
    }

    public void move(Parking destination){
		System.out.println("The vehicle has moved.");
	}

	public void leave(){
		System.out.println("You have leaved the vehicle.");
	}

}
