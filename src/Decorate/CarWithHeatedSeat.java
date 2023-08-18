package Decorate;

import Factory.Driveable;

public class CarWithHeatedSeat extends CarWithOption {
    static int price = 500000;

    public static int getPrice() {
        return price;
    }

    public CarWithHeatedSeat(Driveable car) {
        super(car);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("열선 시트 옵션 추가된 차량");
    }
}
