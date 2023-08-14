
public class CarMain {
    public static void main(String[] args) {

        // 팩토리 메서드 패턴 사용
        CarFactory hyundaiFactory = new HyundaiFactory();
        CarFactory toyotaFactory = new ToyotaFactory();
        CarFactory lamborghiniFactory = new LamborghiniFactory();

        Driveable hyundaiCar = hyundaiFactory.createCar();
        Driveable toyotaCar = toyotaFactory.createCar();
        Driveable lamborghiniCar = lamborghiniFactory.createCar();
        // 어뎁터 패턴 사용
        Driveable bike = new BikeAdapter(new Bike());

        System.out.println("팩토리 메서드 패턴 사용: 현대 자동차 ");
        hyundaiCar.start();
        hyundaiCar.accelerate();
        hyundaiCar.stop();
        System.out.println();

        System.out.println("어뎁터 패턴 사용: 자전거 ");
        bike.start();
        bike.accelerate();
        bike.stop();
        System.out.println();


        // 데코레이터 패턴 사용
        Driveable basicCar = new Hyundai();
        Driveable withBluetooth = new CarWithBluetooth(basicCar);
        Driveable withHeatedSeat = new CarWithHeatedSeat(withBluetooth);

        System.out.println("데코레이터 패턴 사용: 블루투스 + 온열시트");
        withHeatedSeat.start();
        withHeatedSeat.accelerate();
        withHeatedSeat.stop();


    }
}
