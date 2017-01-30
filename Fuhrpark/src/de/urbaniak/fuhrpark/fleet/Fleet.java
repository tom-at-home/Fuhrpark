package de.urbaniak.fuhrpark.fleet;

import java.util.ArrayList;

import de.urbaniak.fuhrpark.vehicles.Vehicle;

public class Fleet {


    protected ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public void showAllVehicles() {
        for (Vehicle vehicle : this.vehicles) {
            System.out.println("Manufacturer: " + vehicle.getManufacturer() +
                    "\nColor: " + vehicle.getColor() +
                    "\nPurchase price: " + vehicle.getPurchasePrice() +
                    "\nFahzeugtyp: " + vehicle.getClass() + "\n");
        }

    }

    public double getFixedAssets(){

        double fixedAssets = 0;

        for (Vehicle vehicle : this.vehicles) {
            fixedAssets += vehicle.getPurchasePrice();
        }

        return fixedAssets;
    }

    public double getFixedAssetsAverage(){

        double fixedAssets = this.getFixedAssets();
        double assetsSize = this.vehicles.size();

        return fixedAssets / (double)assetsSize;
    }

}
