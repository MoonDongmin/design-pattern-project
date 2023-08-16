package Factory;

public class HyundaiFactory implements CarFactory {
    @Override
    public Driveable createCar(){
        return new Hyundai();
    }
}
