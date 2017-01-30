package de.urbaniak.fuhrpark.vehicles;

import de.urbaniak.fuhrpark.fleet.Fleet;
import de.urbaniak.fuhrpark.locations.Airport;

public class Glider extends Plane{

    public Glider(String manufacturer, String color, double purchase_price, Airport current_location, Fleet fleet){
        super(manufacturer, color, purchase_price, current_location, fleet);
        //this.current_location = current_location;
        //this.current_location.addPlane(this);
    }

    public void leave(){
        System.out.println("You have leaved the glider.");
    }

}
