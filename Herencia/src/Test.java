public class Test {
    public static void main(String[] args) {
        inFlight(new Jet());
       // OrbitEarth.log("Testing "+new Satellite());
        orbith(new Satellite());
    }
    private static void inFlight(FlightEnable flier){
        flier.takeOff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if (flier instanceof Trackeable track){
            track.track();
        }
        flier.land();
    }

    private static void orbith(OrbitEarth flier){
        flier.takeOff();
        flier.fly();
        flier.land();
    }
}
