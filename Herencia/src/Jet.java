public class Jet implements  FlightEnable,Trackeable{

    public void move() {
        System.out.println("Bird extend wings");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getName()+" is Taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getName()+" is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getName()+" is flying");
    }

    @Override
    public FlightStages transition(FlightStages stage) {
        //return FlightEnable.super.transition(stage);
        System.out.println(getClass().getName()+" transitioning");
       // return super.transition(stage); //this is a interface not a class
        //you dont invoke super.transition(stage) you need the name of the interface FlightEnable
        return FlightEnable.super.transition(stage);
    }

    @Override
    public void track() {
        System.out.println(getClass().getName()+" coordinates recorded");
    }
}
