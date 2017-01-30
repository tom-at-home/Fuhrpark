package de.urbaniak.fuhrpark.vehicles;

import de.urbaniak.fuhrpark.fleet.Fleet;
import de.urbaniak.fuhrpark.locations.Harbor;

public class Sailingvessel extends Vessel{

    protected boolean isSetSail;

    public Sailingvessel(String manufacturer, String color, double purchase_price, Harbor current_location, Fleet fleet){
        super(manufacturer, color, purchase_price, current_location, fleet);
        this.current_location = current_location;
        this.current_location.addVessel(this);
    }

    public void set_sail(){
        this.isSetSail = true;
        System.out.println("Captain - the sail is set.");
    }

    public void stroke_sail(){
        this.isSetSail = false;
        System.out.println("The sail is stroked.");
    }

    public void move(Harbor destination){
        if(!this.isSetSail) {
            this.set_sail();
        }
        super.move(destination);
    }

    public void leave(){
        if(this.isSetSail){
            this.stroke_sail();
        }
        System.out.println("You have leaved the sail vessel.");
    }

}
