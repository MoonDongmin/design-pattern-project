package Factory;

public class ToyotaFactory implements CarFactory {
    @Override
    public Driveable createCar(){
        return new Toyota();
    }
}
