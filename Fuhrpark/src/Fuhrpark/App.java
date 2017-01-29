package Fuhrpark;

public class App {

    public static void main(String[] args) {

        Fleet fleet = new Fleet();

        Parking centralParking = new Parking("Central parking");
        Parking bremen = new Parking("Bremen");
        Parking hamburg = new Parking("Hamburg");

        Harbor ctb = new Harbor("Burchardkai");
        Harbor sha = new Harbor("Shanghai Harbour");

        Airport bre = new Airport("Bremen Airport");
        Airport jfk = new Airport("John F Kennedy International Airport");

        System.out.println("");

        Convertible cabrio = new Convertible("Opel", "white", 100, centralParking, fleet);
        cabrio.open_roof();
        cabrio.move(bremen);
        cabrio.leave();

        System.out.println("");

        Car bobcar = new Car("Mattel", "red", 10.50, centralParking, fleet);
        bobcar.move(hamburg);
        bobcar.leave();

        System.out.println("");

        Containervessel pacific = new Containervessel("Cosco", "white", 1000, ctb, fleet);
        pacific.move(sha);
        pacific.leave();

        System.out.println("");

        Sailingvessel miami = new Sailingvessel("Luerssen", "marineblue", 2000, ctb, fleet);
        miami.move(sha);
        miami.leave();

        System.out.println("");

        Passengerplane lh543 = new Passengerplane("Lufthansa", "whiteblue", 2200, bre, fleet);
        lh543.move(jfk);
        lh543.leave();

        System.out.println("");

        Glider superglider = new Glider("Cesna", "lightgrey", 1400, jfk, fleet);
        superglider.move(bre);
        superglider.leave();

        System.out.println("");

        Car porsche = new Car("Porsche", "yellow", 200, centralParking, fleet);
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

        System.out.println("Shanghai\n");

        sha.showAllVessels();

        System.out.println("BREMEN AIRPORT\n");

        bre.showAllPlanes();

        System.out.println("VEHICLES\n");

        fleet.showAllVehicles();

        System.out.println("Das Anlagevermoegen der Flotte betraegt: " + fleet.getFixedAssets() + " €\n");

        System.out.println("Der Durchschnitt des Anlagevermoegens der Flotte betraegt: " + fleet.getFixedAssetsAverage() + " €\n");

    }

}
