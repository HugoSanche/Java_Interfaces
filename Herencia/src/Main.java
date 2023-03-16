//NOTE.- DIFFERENTS CLASS HAVE SIMILAR BEHABIOR LIKE BIRD CLASS AND JET CLASS
// IN THE SAME CASE TRUCK CLASS HAVE OME SIMILAR BEHABIOR IN SPICE OF ITS DIFEERENT TO OTHERS

import java.util.LinkedList;
import java.util.List;

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

        Truck truck2=new Truck();
        truck2.track();

        double km=100.00;
        double kmTravels=km*FlightEnable.KM_TO_MILES;

        System.out.printf("The truck traveled %.2f km or %.2f miles%n",km,kmTravels);

        //trackeable.move(); error
        //flightEnable.move(); error
//        flightEnable.takeOff();
//        flightEnable.fly();
//        trackeable.track();
//        flightEnable.land();

        LinkedList<FlightEnable> fliers=new LinkedList<>();
        fliers.add(bird);
        List<FlightEnable> bettherFlier=new LinkedList<>();
        bettherFlier.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(bettherFlier);
        flyFliers(bettherFlier);
        landFliers(bettherFlier);
    }
    private static void inFlight(FlightEnable flier){
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackeable track){
            track.track();
        }
        flier.land();
    }
    public static void triggerFliers(List<FlightEnable> fliers){
        for(var flier:fliers){
            flier.takeOff();
        }
    }
    public static void flyFliers(List<FlightEnable> fliers){
        for(var flier:fliers){
            flier.fly();
        }
    }
    public static void landFliers(List<FlightEnable> fliers){
        for(var flier:fliers){
            flier.land();
        }
    }
}