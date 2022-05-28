package ru.skypro;

public class Car extends Vehicle implements Wheelable, Engineable, Serviceable {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("������ �������� ������.");
    }


    public void checkEngine() {

        System.out.println("��������� ��������� ������.");
    }

    @Override
    public void service() {
            System.out.println("����������� ������ " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                updateTyre();
            }
            checkEngine();

    }
}
