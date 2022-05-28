package ru.skypro;

public class Truck extends Vehicle implements Wheelable, Engineable, Trailerable, Serviceable{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("������ �������� ���������.");
    }

    public void checkEngine() {
        System.out.println("��������� ��������� ���������.");
    }

    public void checkTrailer() {
        System.out.println("��������� ������ ���������.");
    }

    @Override
    public void service() {
            System.out.println("����������� �������� " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                updateTyre();
            }
            checkEngine();
            checkTrailer();

    }
}
