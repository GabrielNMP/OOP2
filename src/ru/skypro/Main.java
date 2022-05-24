package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Vehicle("car1", 4);
        Vehicle car1 = new Vehicle("car2", 4);
        Vehicle truck = new Vehicle("truck1 ", 6);
        Vehicle truck1 = new Vehicle("truck2 ", 8);
        Vehicle bicycle = new Vehicle("bicycle1", 2);
        Vehicle bicycle1 = new Vehicle("bicycle2", 2);


         car.check(car);
         car.checkCar(car);
         car1.check(car1);
         car1.checkCar(car1);
         truck.check(truck);
         truck.checkTruck(truck);
         truck1.check(truck1);
         truck.checkTruck(truck1);
         bicycle.check(bicycle);
         bicycle1.check(bicycle1);

    }
}
