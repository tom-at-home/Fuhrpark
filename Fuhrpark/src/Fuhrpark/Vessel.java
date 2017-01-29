package Fuhrpark;

public class Vessel extends Vehicle{

    protected Harbor current_location;

    public Vessel(String manufacturer, String color, double purchase_price, Harbor current_location, Fleet fleet){
        super(manufacturer, color, purchase_price, fleet);
        this.current_location = current_location;
        this.current_location.addVessel(this);
    }

    public void move(Harbor destination){
        System.out.println("The vessel has moved from " + this.current_location.getName() + " to " + destination.getName());
        this.current_location.remVessel(this);
        this.current_location = destination;
        this.current_location.addVessel(this);
    }

    public void leave(){
        System.out.println("You have leaved the vessel.");
    }

}
