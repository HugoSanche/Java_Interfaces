//NOTE.- DIFFERENTS CLASS HAVE SIMILAR BEHABIOR LIKE BIRD CLASS AND JET CLASS
// IN THE SAME CASE TRUCK CLASS HAVE OME SIMILAR BEHABIOR IN SPICE OF ITS DIFEERENT TO OTHERS

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bird bird =new Bird();
        Animal animal=bird;
        Trackeable trackeable=bird;
        FlightEnable flightEnable=bird;

        bird.move();;
        animal.move();

        inFlight(bird);
        inFlight(new Jet());

        Trackeable truck =new Truck();
        truck.track();

        double km=100.00;
        double kmTravels=km*FlightEnable.KM_TO_MILES;

        System.out.printf("The truck traveled %.2f km or %.2f miles%n",km,kmTravels);

        //trackeable.move(); error
        //flightEnable.move(); error
//        flightEnable.takeOff();
//        flightEnable.fly();
//        trackeable.track();
//        flightEnable.land();
    }
    private static void inFlight(FlightEnable flier){
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackeable track){
            track.track();
        }
        flier.land();
    }
}