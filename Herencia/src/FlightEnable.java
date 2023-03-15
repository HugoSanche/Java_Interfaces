//NOTA: Default class in java es Packet private.- only visible for the classes in the same packet
//      Default interface in java is public

public interface FlightEnable {
    public abstract void takeOff(); //its not necesary write "public abstract"
    abstract void land(); //its noy necessary write abstract
    void fly(); //its ok
  //  protected  void test(); protected its not allow in interfaces
}
