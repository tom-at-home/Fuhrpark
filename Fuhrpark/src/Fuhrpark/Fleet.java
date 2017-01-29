package Fuhrpark;

import java.util.ArrayList;

public class Fleet {


    protected ArrayList<Vehicle> vehicles = new ArrayList<>();

    protected void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    protected void showAllVehicles() {
        for (Vehicle vehicle : this.vehicles) {
            System.out.println("Manufacturer: " + vehicle.manufacturer +
                    "\nColor: " + vehicle.color +
                    "\nPurchase price: " + vehicle.purchase_price +
                    "\nFahzeugtyp: " + vehicle.getClass() + "\n");
        }

    }

    protected double getFixedAssets(){

        double fixedAssets = 0;

        for (Vehicle vehicle : this.vehicles) {
            fixedAssets += vehicle.purchase_price;
        }

        return fixedAssets;
    }

    protected double getFixedAssetsAverage(){

        double fixedAssets = this.getFixedAssets();
        double assetsSize = this.vehicles.size();

        return fixedAssets / assetsSize;
    }

}
