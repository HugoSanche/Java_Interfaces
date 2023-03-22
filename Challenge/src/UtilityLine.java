enum UtilityType{ELECTRICAL,FIBER_OPTICAL, GAS, WATER}
public class UtilityLine implements Mappable {
    private String name;
    private UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }
    @Override
    public String getLabel() {
        return name +" ("+type+")";
    }
    @Override
    public String getMarker() {
        return switch(type){
            case ELECTRICAL-> Color.RED +" "+PointMarker.DASHED;
            case FIBER_OPTICAL ->Color.GREEN+ " "+PointMarker.DOTTED;
            case GAS-> Color.ORANGE +" "+PointMarker.SOLID;
            case WATER ->Color.GREEN+ " "+PointMarker.SOLID;
            default -> Color.RED+" "+PointMarker.SOLID;
        };
    }
    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }
    @Override
    public String toJSON() {
        return  Mappable.super.toJSON()+ """
                , "Name" :"%s" """.formatted(name);
    }
}
