
 enum UsageType{BUSINESS,ENTERTAINMENT,GOVERNMENT, RESIDENTIAL, SPORTS}
public class Building implements Mappable {

    private String name;
    private UsageType type;

    public Building(String name, UsageType type) {
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
            case BUSINESS-> Color.RED +" "+PointMarker.TRIANGLE;
            case ENTERTAINMENT ->Color.GREEN+ " "+PointMarker.STAR;
            case GOVERNMENT  ->Color.BLUE+" "+PointMarker.CIRCLE;
            case RESIDENTIAL  ->Color.ORANGE+" "+PointMarker.SQUARE;
            case SPORTS -> Color.BLACK+" "+PointMarker.PUSH_PIN;
            default -> Color.RED+" "+PointMarker.SQUARE;
        };
    }

    @Override
    public String toJSON() {
        return  Mappable.super.toJSON()+ """ 
                , "Name :" "%s" """.formatted(name);
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }
}
