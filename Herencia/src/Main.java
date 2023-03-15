public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bird bird =new Bird();
        Animal animal=bird;
        Trackeable trackeable=bird;
        FlightEnable flightEnable=bird;

        bird.move();;
        animal.move();
        //trackeable.move(); error
        //flightEnable.move(); error
        flightEnable.takeOff();
        flightEnable.fly();
        trackeable.track();
        flightEnable.land();
    }
}