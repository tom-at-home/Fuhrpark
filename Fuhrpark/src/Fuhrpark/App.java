package Fuhrpark;

public class App {

    public static void main(String[] args) {
        Convertible cabrio = new Convertible("Opel", "white", 12378.95);
        cabrio.open_roof();
        cabrio.close_roof();

        System.out.println(cabrio.isEngineOn);
    }

}
