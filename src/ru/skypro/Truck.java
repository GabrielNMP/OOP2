package ru.skypro;

public class Truck extends Vehicle implements Wheelable, Engineable, Trailerable, Serviceable{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика.");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика.");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика.");
    }

    @Override
    public void service() {
            System.out.println("Обслуживаем грузовик " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                updateTyre();
            }
            checkEngine();
            checkTrailer();

    }
}
