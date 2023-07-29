abstract class CarWithOption implements Car {
    protected Car car;

    public CarWithOption(Car car) {
        this.car = car;
    }

    @Override
    public void start() {
        car.start();
    }

    @Override
    public void accelerate() {
        car.accelerate();
    }

    @Override
    public void stop() {
        car.stop();
    }
}
