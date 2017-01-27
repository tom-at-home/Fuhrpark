package Fuhrpark;

public class Car extends Vehicle{

    protected boolean isEngineOn;

    public Car(String manufacturer, String color, double purchase_price){
        super(manufacturer, color, purchase_price);
    }

    public void start_engine(){
        this.isEngineOn = true;
        System.out.println("Ignition - the engine is on.");
    }

    public void stop_engine(){
        this.isEngineOn = false;
        System.out.println("The engine is off.");
    }

    public void move_forward(int miles){
        if(!this.isEngineOn) {
            this.start_engine();
        }
        this.miles += miles;
        System.out.println("The vehicle has moved " + this.miles + " miles since ignition.");
    }

    public void leave(){
        if(this.isEngineOn){
            this.stop_engine();
        }
        System.out.println("You have leaved the car.");
    }

}
