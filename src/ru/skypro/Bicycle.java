package ru.skypro;

public class Bicycle extends Vehicle implements Wheelable{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {

        System.out.println("������ ��������");
    }

    @Override
    public void check(Vehicle bicycle) {
        super.check(bicycle);
    }
}
