enum Color{BLACK,BLUE,GREEN,ORANGE,RED}
enum PointMarker{CIRCLE,PUSH_PIN,STAR,SQUARE,TRIANGLE,SOLID,DASHED,DOTTED}
enum LineMarker{DASHED,DOTTED,SOLID}

public interface Mappable {
    public static final String JSON_PROPERTY= """
            "properties":{%s}
            """ ;
     String getLabel();
     String getMarker();
    Geometry getShape();
    default String toJSON(){
        return """
                "Type": "%s", "Label": "%s", "Marker":"%s"
                """.formatted(getShape(),getLabel(),getMarker());
    }
    static void mappable(Mappable map){
       System.out.println(JSON_PROPERTY.formatted(map.toJSON()));
    }
}
