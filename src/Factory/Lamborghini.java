package Factory;

import Factory.Driveable;

public class Lamborghini implements Driveable {
    @Override
    public void start(){
        System.out.println("람보르기니 자동차 시동 ON.");
    }
    @Override
    public void accelerate(){
        System.out.println("람보르기니 자동차 주행중 입니다.");
    }

    @Override
    public void stop(){
        System.out.println("람보르기니 자동차 멈춤.");
    }
}
