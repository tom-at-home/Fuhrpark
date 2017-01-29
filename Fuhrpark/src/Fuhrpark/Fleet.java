package Fuhrpark;

import java.util.ArrayList;

public class Fleet {


    protected ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void showAllVehicles() {
        for (Vehicle vehicle : this.vehicles) {
            System.out.println("Manufacturer: " + vehicle.manufacturer +
                    "\nColor: " + vehicle.color +
                    "\nPurchase price: " + vehicle.purchase_price +
                    "\nFahzeugtyp: " + vehicle.getClass() + "\n");
        }

    }

}
