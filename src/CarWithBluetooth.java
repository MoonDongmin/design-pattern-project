public class CarWithBluetooth extends CarWithOption{
    public CarWithBluetooth(Driveable car){
        super(car);
    }

    @Override
    public void accelerate(){
        super.accelerate();
        System.out.println("블루투스 옵션 추가된 차량");
    }
}
