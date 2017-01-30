package de.urbaniak.fuhrpark.locations;

import java.util.ArrayList;

import de.urbaniak.fuhrpark.vehicles.Plane;

public class Airport extends Location {


    protected ArrayList<Plane> planes = new ArrayList<>();

    public Airport(String name) {
        super(name);
        //this.locations.add(this);
    }
    
    public String getName(){
        return this.name;
    }    

    public void addPlane(Plane plane) {
        this.planes.add(plane);
    }

    public void remPlane(Plane plane) {
        this.planes.remove(plane);
    }

    public void showAllPlanes() {
        for (Plane plane : this.planes) {
            System.out.println("Manufacturer: " + plane.getManufacturer() +
                    "\nColor: " + plane.getColor() +
                    "\nCurrent Location: " + plane.getCurrentLocation().name + "\n");
        }

    }

}
