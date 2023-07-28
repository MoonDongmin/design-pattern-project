package DesignPatternProject;

public class HyundaiFactory implements CarFactory{
    @Override
    public Car createCar(){
        return new Hyundai();
    }
}
