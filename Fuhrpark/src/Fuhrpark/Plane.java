package Fuhrpark;

public class Plane extends Vehicle{

    protected Airport current_location;

    public Plane(String manufacturer, String color, double purchase_price, Airport current_location, Fleet fleet){
        super(manufacturer, color, purchase_price, fleet);
        this.current_location = current_location;
        this.current_location.addPlane(this);
    }

    public void move(Airport destination){
        System.out.println("The plane has flown from " + this.current_location.getName() + " to " + destination.getName());
        this.current_location.remPlane(this);
        this.current_location = destination;
        this.current_location.addPlane(this);
    }

    public void leave(){
        System.out.println("You have leaved the plane.");
    }

}
