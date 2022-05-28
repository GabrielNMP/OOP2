package ru.skypro;

public class Car extends Vehicle implements Wheelable, Engineable, Serviceable {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку машины.");
    }


    public void checkEngine() {

        System.out.println("Проверяем двигатель машины.");
    }

    @Override
    public void service() {
            System.out.println("Обслуживаем машину " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                updateTyre();
            }
            checkEngine();

    }
}
