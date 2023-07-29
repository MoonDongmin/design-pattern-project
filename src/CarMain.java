public class CarMain {
    public static void main(String[] args) {

        CarFactory toyotaFactory = new ToyotaFactory();
        Car toyota = toyotaFactory.createCar();


    }
}
