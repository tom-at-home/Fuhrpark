package de.urbaniak.fuhrpark.locations;

import java.util.ArrayList;

import de.urbaniak.fuhrpark.vehicles.Vessel;

public class Harbor extends Location {


    protected ArrayList<Vessel> vessels = new ArrayList<>();

    public Harbor(String name) {
        super(name);
        //this.locations.add(this);
    }

    public String getName(){
        return this.name;
    }    
    
    public void addVessel(Vessel vessel) {
        this.vessels.add(vessel);
    }

    public void remVessel(Vessel vessel) {
        this.vessels.remove(vessel);
    }

    public void showAllVessels() {
        for (Vessel vessel : this.vessels) {
            System.out.println("Manufacturer: " + vessel.getManufacturer() +
                    "\nColor: " + vessel.getColor() +
                    "\nCurrent Location: " + vessel.getCurrentLocation().name + "\n");
        }

    }

}
