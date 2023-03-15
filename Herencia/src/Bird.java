public class Bird extends Animal implements Trackeable, FlightEnable {
    @Override
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
    public void track() {
        System.out.println(getClass().getName()+" coordinates recorded");
    }
}
