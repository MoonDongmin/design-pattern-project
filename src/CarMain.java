import Adapter.Bike;
import Adapter.BikeAdapter;
import Decorate.CarWithBluetooth;
import Decorate.CarWithHeatedSeat;
import Factory.*;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 팩토리 메서드 패턴 사용
        CarFactory hyundaiFactory = new HyundaiFactory();
        CarFactory toyotaFactory = new ToyotaFactory();
        CarFactory lamborghiniFactory = new LamborghiniFactory();

        Driveable hyundaiCar = hyundaiFactory.createCar();
        Driveable toyotaCar = toyotaFactory.createCar();
        Driveable lamborghiniCar = lamborghiniFactory.createCar();

        // 어뎁터 패턴 사용
        Driveable bike = new BikeAdapter(new Bike());

        while (true) {
            System.out.println("\n자동차를 고르시오.");
            System.out.println("1.현대 2.토요타 3.람보르기니 4.자전거 5.종료");
            int button = scanner.nextInt();

            if (button == 1) {
                System.out.println("팩토리 메서드 패턴 사용: 현대 자동차 ");
                hyundaiCar.start();
                hyundaiCar.accelerate();
                hyundaiCar.stop();
                System.out.println();

                System.out.println("\n<데코레이터 패턴>");
                System.out.println("추가할 옵션을 선택하세요.");
                System.out.println("1.블루투스 2.열선시트 3.블루투스+열선시트");
                int option = scanner.nextInt();

                if (option == 1) {
                    Driveable withBluetooth = new CarWithBluetooth(hyundaiCar);
                    withBluetooth.accelerate();
                    System.out.println("현대 차량의 옵션 가격: " + CarWithBluetooth.getPrice() + "원");
                } else if (option == 2) {
                    Driveable withHeatedSeat = new CarWithHeatedSeat(hyundaiCar);
                    withHeatedSeat.accelerate();
                    System.out.println("현대 차량의 옵션 가격: " + CarWithHeatedSeat.getPrice() + "원");
                } else if (option == 3) {
                    Driveable withBluetooth = new CarWithBluetooth(hyundaiCar);
                    Driveable fullOption = new CarWithHeatedSeat(withBluetooth);
                    fullOption.accelerate();
                    System.out.println("현대 차량의 옵션 가격: " + (CarWithHeatedSeat.getPrice() + CarWithBluetooth.getPrice()) + "원");
                } else {
                    System.out.println("잘못된 키를 눌렀습니다. 프로그램 강제 종료!");
                    System.exit(0);
                }

            } else if (button == 2) {
                System.out.println("팩토리 메서드 패턴 사용: 토요타 ");
                toyotaCar.start();
                toyotaCar.accelerate();
                toyotaCar.stop();
                System.out.println();

                System.out.println("\n<데코레이터 패턴>");
                System.out.println("추가할 옵션을 선택하세요.");
                System.out.println("1.블루투스 2.열선시트 3.블루투스+열선시트");
                int option = scanner.nextInt();

                if (option == 1) {
                    Driveable withBluetooth = new CarWithBluetooth(toyotaCar);
                    withBluetooth.accelerate();
                    System.out.println("토요타 차량의 옵션 가격: " + CarWithBluetooth.getPrice() + "원");
                } else if (option == 2) {
                    Driveable withHeatedSeat = new CarWithHeatedSeat(toyotaCar);
                    withHeatedSeat.accelerate();
                    System.out.println("토요타 차량의 옵션 가격: " + CarWithHeatedSeat.getPrice() + "원");
                } else if (option == 3) {
                    Driveable withBluetooth = new CarWithBluetooth(toyotaCar);
                    Driveable fullOption = new CarWithHeatedSeat(withBluetooth);
                    fullOption.accelerate();
                    System.out.println("토요타 차량의 옵션 가격: " + (CarWithHeatedSeat.getPrice() + CarWithBluetooth.getPrice()) + "원");
                } else {
                    System.out.println("잘못된 키를 눌렀습니다. 프로그램 강제 종료!");
                    System.exit(0);
                }

            } else if (button == 3) {
                System.out.println("팩토리 메서드 패턴 사용: 람보르기니 ");
                lamborghiniCar.start();
                lamborghiniCar.accelerate();
                lamborghiniCar.stop();
                System.out.println();

                System.out.println("\n<데코레이터 패턴>");
                System.out.println("추가할 옵션을 선택하세요.");
                System.out.println("1.블루투스 2.열선시트 3.블루투스+열선시트");
                int option = scanner.nextInt();

                if (option == 1) {
                    Driveable withBluetooth = new CarWithBluetooth(lamborghiniCar);
                    withBluetooth.accelerate();
                    System.out.println("람보르기니 차량의 옵션 가격: " + CarWithBluetooth.getPrice() + "원");
                } else if (option == 2) {
                    Driveable withHeatedSeat = new CarWithHeatedSeat(lamborghiniCar);
                    withHeatedSeat.accelerate();
                    System.out.println("람보르기니 차량의 옵션 가격: " + CarWithHeatedSeat.getPrice() + "원");
                } else if (option == 3) {
                    Driveable withBluetooth = new CarWithBluetooth(lamborghiniCar);
                    Driveable fullOption = new CarWithHeatedSeat(withBluetooth);
                    fullOption.accelerate();
                    System.out.println("람보르기니 차량의 옵션 가격: " + (CarWithHeatedSeat.getPrice() + CarWithBluetooth.getPrice()) + "원");
                } else {
                    System.out.println("잘못된 키를 눌렀습니다. 프로그램 강제 종료!");
                    System.exit(0);
                }

            } else if (button == 4) {
                System.out.println("어뎁터 패턴 사용: 자전거 ");
                bike.start();
                bike.accelerate();
                bike.stop();
                System.out.println();
            } else if (button == 5) {
                System.out.println("프로그램이 종료되었습니다.");
                System.exit(0);
            } else {
                System.out.println("잘못된 버튼 입력입니다. 다시 고르시오.");
            }
        }
    }
}
