enum FlightStages implements Trackeable{GROUNDED,LAUNCH,CRUISE,DATA_COLLECTION;

    @Override
    public void track() {
        if (this!=GROUNDED ){
            System.out.println("Monitoring "+this);
        }
    }
    public FlightStages getNextStage(){
        FlightStages[] allStages= values();
        return allStages[ordinal()+1 % allStages.length];
    }
}

//NOTA.- usually records does not use methods but in this case need to implement methods of FligEnable
record DragonFly(String name, String type) implements FlightEnable {

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

public abstract class Animal {
    public abstract void move();
}
