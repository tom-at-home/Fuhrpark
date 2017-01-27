package Fuhrpark;

public class App {

    public static void main(String[] args) {

        System.out.println("");

        Convertible cabrio = new Convertible("Opel", "white", 12378.95);
        cabrio.open_roof();
        cabrio.move_forward(13);
        cabrio.leave();

        System.out.println("");

        Car bobcar = new Car("Mattel", "red", 29.50);
        bobcar.move_forward(2);
        bobcar.leave();

    }

}
