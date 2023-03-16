public class Truck implements Trackeable{
    @Override
    public void track() {
        System.out.println(getClass().getName()+" coordinates recorded");
    }
}
