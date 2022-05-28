package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Car car = new Car ("car1", 4);
        Car car1 = new Car ("car2",4);

        Truck truck = new Truck("truck1 ", 6);
        Truck truck1 = new Truck("truck2 ", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle1 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();
        station.station(car);
        station.station(car1);
        station.station(truck);
        station.station(truck1);
        station.station(bicycle);
        station.station(bicycle1);
















    }
}
