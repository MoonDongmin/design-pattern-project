package Factory;

public class LamborghiniFactory implements CarFactory {
    @Override
    public Driveable createCar() {
        return new Lamborghini();
    }
}
