import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> maps=new ArrayList<>();
        maps.add(new Building("Mexico City",UsageType.RESIDENTIAL));
        maps.add(new Building("Museo de antropologia", UsageType.ENTERTAINMENT));
        maps.add(new Building("Palacio de Gobierno",UsageType.GOVERNMENT));

        maps.add(new UtilityLine("Paseo de la Reforma",UtilityType.FIBER_OPTICAL));
        maps.add(new UtilityLine("Insurgentes",UtilityType.WATER));
        maps.add(new UtilityLine("Constituyentes",UtilityType.GAS));
        for (var m: maps){
            Mappable.mappable(m);
        }

    }
}