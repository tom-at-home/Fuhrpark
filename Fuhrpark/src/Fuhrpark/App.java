package Fuhrpark;

public class App {

    public static void main(String[] args) {

        Fleet fleet = new Fleet();

        Parking centralParking = new Parking("Central parking");
        Parking bremen = new Parking("Bremen");
        Parking hamburg = new Parking("Hamburg");

        System.out.println("");

        Convertible cabrio = new Convertible("Opel", "white", 12378.95, centralParking, fleet);
        cabrio.open_roof();
        cabrio.move(bremen);
        cabrio.leave();

        System.out.println("");

        Car bobcar = new Car("Mattel", "red", 29.50, centralParking, fleet);
        bobcar.move(hamburg);
        bobcar.leave();

        System.out.println("");

        Car porsche = new Car("Porsche", "yellow", 89500.40, centralParking, fleet);
        porsche.move(hamburg);
        porsche.move(bremen);
        porsche.leave();

        System.out.println("");

        System.out.println("Central parking\n");

        centralParking.showAllCars();

        System.out.println("Bremen\n");

        bremen.showAllCars();

        System.out.println("Hamburg\n");

        hamburg.showAllCars();

        System.out.println("VEHICLES\n");

        fleet.showAllVehicles();


    }

}
