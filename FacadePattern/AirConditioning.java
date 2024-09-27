public class AirConditioning implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("Air Conditioning now running");
    }

    @Override
    public void turnOff() {
        System.out.println("Air Conditioning shut down");
    }
}