package Fuhrpark;

import java.util.ArrayList;

public class Parking {

    private String name;
    protected ArrayList<Car> cars = new ArrayList<>();

    public Parking(String name) {
        this.name = name;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

}
