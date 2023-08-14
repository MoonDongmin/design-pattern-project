public class BikeAdapter implements Driveable {
    Bike bike;

    public BikeAdapter(Bike bike) {
        this.bike = bike;
    }

    @Override
    public void start() {
        bike.ready();
    }

    @Override
    public void accelerate() {
        bike.running();
    }

    @Override
    public void stop() {
        bike.stop();
    }
}
