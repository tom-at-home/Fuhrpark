package Fuhrpark;

public class Containervessel extends Vessel{

    protected boolean isEngineOn;

    protected Harbor current_location;


    public Containervessel(String manufacturer, String color, double purchase_price, Harbor current_location, Fleet fleet){
        super(manufacturer, color, purchase_price, current_location, fleet);
        this.current_location = current_location;
        this.current_location.addVessel(this);
    }

    public void start_engine(){
        this.isEngineOn = true;
        System.out.println("Captain - the engine is on.");
    }

    public void stop_engine(){
        this.isEngineOn = false;
        System.out.println("The engine is off.");
    }

    public void move(Harbor destination){
        if(!this.isEngineOn) {
            this.start_engine();
        }
        System.out.println("The vessel has moved from " + this.current_location.getName() + " to " + destination.getName());
        this.current_location.remVessel(this);
        this.current_location = destination;
        this.current_location.addVessel(this);

    }

    public void leave(){
        if(this.isEngineOn){
            this.stop_engine();
        }
        System.out.println("You have leaved the vessel.");
    }

}
