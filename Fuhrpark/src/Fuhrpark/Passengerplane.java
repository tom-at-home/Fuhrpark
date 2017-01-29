package Fuhrpark;

public class Passengerplane extends Plane{

    protected boolean isEngineOn;

    //protected Airport current_location;

    public Passengerplane(String manufacturer, String color, double purchase_price, Airport current_location, Fleet fleet){
        super(manufacturer, color, purchase_price, current_location, fleet);
        //this.current_location = current_location;
        //this.current_location.addPlane(this);
    }

    public void start_engine(){
        this.isEngineOn = true;
        System.out.println("Flight captain - the turbines are on.");
    }

    public void stop_engine(){
        this.isEngineOn = false;
        System.out.println("The turbines are off.");
    }

    public void move(Airport destination){
        if(!this.isEngineOn) {
            this.start_engine();
        }
        super.move(destination);
    }

    public void leave(){
        if(this.isEngineOn){
            this.stop_engine();
        }
        System.out.println("You have leaved the passenger plane.");
    }

}
