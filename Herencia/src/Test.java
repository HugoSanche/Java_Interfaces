public class Test {
    public static void main(String[] args) {
        inFlight(new Jet());
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
}
