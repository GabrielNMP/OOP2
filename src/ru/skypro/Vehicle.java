package ru.skypro;

import java.util.Objects;

public class Vehicle   {
    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {

        return modelName;
    }

    public void setModelName(String modelName) {

        this.modelName = modelName;
    }

    public int getWheelsCount() {

        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {

        this.wheelsCount = wheelsCount;
    }

    public static void WhellIn (Wheelable vehicle) {

        vehicle.updateTyre();
    }

    public void updateTyre() {
        System.out.println("������ ��������");
    }


    public void checkEngine() {
        System.out.println("��������� ���������");
    }


    public void checkTrailer() {
        System.out.println("��������� ������");
    }
    public void check(Vehicle vehicle) {
        if (vehicle != null) {
            System.out.println("����������� " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
        }
    }
    public void checkCar(Vehicle car) {
        if (car != null) {
            car.checkEngine();
        }

    }
    public void checkTruck(Vehicle truck) {
        if (truck != null) {
            truck.checkEngine();
            truck.checkTrailer();
        }

    }

}
