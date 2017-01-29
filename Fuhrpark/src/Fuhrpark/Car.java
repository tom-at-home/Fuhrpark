package Fuhrpark;

public class Car extends Vehicle{

    protected boolean isEngineOn;

    protected Parking current_location;


    public Car(String manufacturer, String color, double purchase_price, Parking current_location, Fleet fleet){
        super(manufacturer, color, purchase_price, fleet);
        this.current_location = current_location;
        this.current_location.addCar(this);
    }

    public void start_engine(){
        this.isEngineOn = true;
        System.out.println("Ignition - the engine is on.");
    }

    public void stop_engine(){
        this.isEngineOn = false;
        System.out.println("The engine is off.");
    }

    public void move(Parking destination){
        if(!this.isEngineOn) {
            this.start_engine();
        }
        System.out.println("The car has moved from " + this.current_location.getName() + " to " + destination.getName());
        this.current_location.remCar(this);
        this.current_location = destination;
        this.current_location.addCar(this);

    }

    public void leave(){
        if(this.isEngineOn){
            this.stop_engine();
        }
        System.out.println("You have leaved the car.");
    }

}
