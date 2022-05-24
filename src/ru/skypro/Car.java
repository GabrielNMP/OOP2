package ru.skypro;

public class Car extends Vehicle implements Wheelable, Engineable {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void check(Vehicle car) {
        super.check(car);
        car.checkEngine();
    }
    public void checkCar(Car car) {
        if (car != null) {
            car.checkEngine();
            }

    }


}
