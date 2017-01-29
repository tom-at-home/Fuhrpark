package Fuhrpark;

import java.util.ArrayList;

public class Parking extends Location {


    protected ArrayList<Car> cars = new ArrayList<>();

    public Parking(String name) {
        super(name);
        //this.locations.add(this);
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void remCar(Car car) {
        this.cars.remove(car);
    }

    public void showAllCars() {
        for (Car car : this.cars) {
            System.out.println("Manufacturer: " + car.manufacturer +
                    "\nColor: " + car.color +
                    "\nCurrent Location: " + car.current_location.name + "\n");
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

    public String getName(){
        return this.name;
    }

}
