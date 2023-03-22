//NOTA.-CHECK USE THE KEY WORD EXTENDS NOT USE IMPLEMENT.
//INTERFACE USE EXTENDS


public interface OrbitEarth extends FlightEnable {
    void achieveOrbit();

    //if you use static you can have body en the method
    //remember protected is not valid in interfaces
    private static void log(String description){
        var today=new java.util.Date();
        System.out.println(today+" : "+description);
    }
    private static void logStage(FlightStages stage, String description){
        description= stage+": "+description;
        log(description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        System.out.println("Aqi");
        FlightStages nextStage=FlightEnable.super.transition(stage);
        logStage(stage, "Begin Transition to " +nextStage);
        return nextStage;
    }
}
