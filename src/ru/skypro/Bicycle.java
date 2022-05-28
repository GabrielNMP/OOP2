package ru.skypro;

public class Bicycle extends Vehicle implements Wheelable, Serviceable {


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("������ �������� ����������.");
    }

    @Override
    public void service() {
            System.out.println("����������� ���������  " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                updateTyre();
            }
    }

}