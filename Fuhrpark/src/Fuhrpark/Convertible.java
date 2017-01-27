package Fuhrpark;

public class Convertible extends Car {

    private boolean isRoofOpen;

    public Convertible(String manufacturer, String color, double purchase_price) {
        super(manufacturer, color, purchase_price);
    }

    public void open_roof() {
        if (!this.isRoofOpen) {
            this.isRoofOpen = true;
            System.out.println("The roof is open. Wow, the sun is shining.");
        }
    }

    public void close_roof() {
        if (this.isRoofOpen) {
            this.isRoofOpen = false;
            System.out.println("The roof is closed. Your convertible is protected.");
        }
    }

    public void leave() {
        if (this.isEngineOn) {
            this.stop_engine();
        }
        if (this.isRoofOpen) {
            this.close_roof();
        }
        System.out.println("You have leaved your convertible.");
    }


}
