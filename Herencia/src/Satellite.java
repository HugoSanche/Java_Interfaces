//NOTA.- this class need to implement methods of OrbitEarth and FlighEnable

public class Satellite implements OrbitEarth {
    FlightStages stage=FlightStages.GROUNDED;
    @Override
    public void achieveOrbit() {
        transition("Orbit achieved");
    }

    @Override
    public void takeOff() {
        transition("Taking off");
    }

    @Override
    public void land() {
        transition("Landing");
    }

    @Override
    public void fly() {
        achieveOrbit();
        transition("Data Collection while Orbiting");
    }
    public void transition(String description){
        System.out.println(description);
        System.out.println("x "+stage);
        stage=transition(stage);
        System.out.println("Y "+stage);

        //System.out.println("Hola");
        stage.track();
    }
}
