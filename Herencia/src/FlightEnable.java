//NOTA: Default class in java es Packet private.- only visible for the classes in the same packet
//      Default interface in java is public

//Constants in java in interfaces are public static final and primitive or String.
public interface FlightEnable {
   public static final double MILES_TO_KM=1.60934; //public static final are redudant

    double KM_TO_MILES=0.621371; //implicity its public static final

    public abstract void takeOff(); //its not necesary write "public abstract"

    abstract void land(); //its noy necessary write abstract

    void fly(); //its ok
  //  protected  void test(); protected its not allow in interfaces

    default FlightStages transition(FlightStages stage){
       // System.out.println("Transitions not implemented "+getClass().getName());
       // return null;
        FlightStages nextStage=stage.getNextStage();
        System.out.println("Transition from "+stage+" to " +nextStage);
        return nextStage;
    }
}
