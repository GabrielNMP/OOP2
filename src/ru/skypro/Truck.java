package ru.skypro;

public class Truck extends Vehicle implements Wheelable, Engineable, Trailerable {

    public Truck(String modelName, int wheelsCount) {

        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("������ ��������");
    }

    @Override
    public void checkEngine() {
        System.out.println("��������� ���������");
    }

    @Override
    public void checkTrailer() {
        System.out.println("��������� ������");
    }

    @Override
    public void check(Vehicle truck) {
        super.check(truck);
    }
}
