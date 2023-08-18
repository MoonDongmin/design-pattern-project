package Decorate;

import Factory.Driveable;

public class CarWithBluetooth extends CarWithOption {
    static int price = 100000;

    public static int getPrice() {
        return price;
    }

    public CarWithBluetooth(Driveable car) {
        super(car);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("블루투스 옵션 추가된 차량");
    }

}
