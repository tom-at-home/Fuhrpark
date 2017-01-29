package Fuhrpark;

import java.util.ArrayList;

public class Airport extends Location {


    protected ArrayList<Plane> planes = new ArrayList<>();

    public Airport(String name) {
        super(name);
        //this.locations.add(this);
    }

    public void addPlane(Plane plane) {
        this.planes.add(plane);
    }

    public void remPlane(Plane plane) {
        this.planes.remove(plane);
    }

    public void showAllPlanes() {
        for (Plane plane : this.planes) {
            System.out.println("Manufacturer: " + plane.manufacturer +
                    "\nColor: " + plane.color +
                    "\nCurrent Location: " + plane.current_location.name + "\n");
        }

    }

    public String getName(){
        return this.name;
    }

}
