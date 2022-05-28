package ru.skypro;

public class Bicycle extends Vehicle implements Wheelable, Serviceable {


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда.");
    }

    @Override
    public void service() {
            System.out.println("Обслуживаем велосипед  " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                updateTyre();
            }
    }

}