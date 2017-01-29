package Fuhrpark;

import java.util.ArrayList;

public class Harbor extends Location {


    protected ArrayList<Vessel> vessels = new ArrayList<>();

    public Harbor(String name) {
        super(name);
        //this.locations.add(this);
    }

    public void addVessel(Vessel vessel) {
        this.vessels.add(vessel);
    }

    public void remVessel(Vessel vessel) {
        this.vessels.remove(vessel);
    }

    public void showAllVessels() {
        for (Vessel vessel : this.vessels) {
            System.out.println("Manufacturer: " + vessel.manufacturer +
                    "\nColor: " + vessel.color +
                    "\nCurrent Location: " + vessel.current_location.name + "\n");
        }

    }

    public String getName(){
        return this.name;
    }

}
