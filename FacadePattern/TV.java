public class TV implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("TV now streaming");
    }

    @Override
    public void turnOff() {
        System.out.println("TV power off");
    }
}