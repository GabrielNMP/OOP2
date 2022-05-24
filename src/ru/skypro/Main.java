package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Vehicle("car1", 4);
        Vehicle car2 = new Vehicle("car2", 4);
        Vehicle truck = new Vehicle("truck1 ", 6);
        Vehicle truck2 = new Vehicle("truck2 ", 8);
        Vehicle bicycle = new Vehicle("bicycle1", 2);
        Vehicle bicycle2 = new Vehicle("bicycle2", 2);

        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}
