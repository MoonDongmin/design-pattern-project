package Decorate;

import Factory.Driveable;

abstract class CarWithOption implements Driveable {
    protected Driveable car;
    public CarWithOption(Driveable car) {
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
