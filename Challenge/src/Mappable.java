
public interface Mappable {
    public static final String JSON_PROPERTY="properties";
     String getLabel();
     String getMarker();
    Geometry getShape();
    default void toJSON(){

    }
    static void mappable(Mappable map){

    }
}
