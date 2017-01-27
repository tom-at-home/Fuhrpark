package Fuhrpark;

public class App {

    public static void main(String[] args) {

        Parking centralParking = new Parking("Central parking");

        System.out.println("");

        Convertible cabrio = new Convertible("Opel", "white", 12378.95);
        centralParking.addCar(cabrio);
        cabrio.open_roof();
        cabrio.move_forward(13);
        cabrio.leave();

        System.out.println("");

        Car bobcar = new Car("Mattel", "red", 29.50);
        centralParking.addCar(bobcar);
        bobcar.move_forward(2);
        bobcar.leave();

        System.out.println("");

        centralParking.showAllCars();

    }

}
