package de.urbaniak.fuhrpark.locations;

import java.util.ArrayList;

import de.urbaniak.fuhrpark.vehicles.Car;

public class Parking extends Location {


    protected ArrayList<Car> cars = new ArrayList<>();

    public Parking(String name) {
        super(name);
        //this.addLocation(this);
    }
    
    public String getName(){
        return this.name;
    }    

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void remCar(Car car) {
        this.cars.remove(car);
    }

    public void showAllCars() {
        for (Car car : this.cars) {
            System.out.println("Manufacturer: " + car.getManufacturer() +
                    "\nColor: " + car.getColor() +
                    "\nCurrent Location: " + car.getCurrentLocation().name + "\n");
        }

    }

    /*public void showAllLocations(){

        for (int i = 0; i < this.locations.size(); i++) {
            System.out.println("LOCATION: " + locations);
        }

    }*/

    /*public void showAllLocations(){

        for (int i = 0; i < this.locations.size(); i++) {
            System.out.println("LOCATION: " + locations.get(i));
        }

    }*/



}
