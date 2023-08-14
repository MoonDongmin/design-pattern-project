public class CarWithHeatedSeat extends CarWithOption{
    public CarWithHeatedSeat(Driveable car){
        super(car);
    }

    @Override
    public void accelerate(){
        super.accelerate();
        System.out.println("열선 시트 옵션 추가된 차량");
    }
}
