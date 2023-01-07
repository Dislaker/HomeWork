package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {

    private String carModel;
    private String carClass;
    private int weight;
    private Engine engine;
    private Driver driver;


    public Car(String carModel, String carClass, int weight, Engine engine, Driver driver) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
    }


    public String getCarModel() {
        return carModel;
    }

    public String getCarClass() {
        return carClass;
    }

    public int getWeight() {
        return weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }


    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String toString() {
        return "Model: " + carModel + "\nClass: " + carClass + "\nWeight: " + weight +
                "\nPower: " + engine.getPower() + "\nCompany: " + engine.getCompany() +
                "\nFull Name: " + driver.getFullName() + "\nExperience: " + driver.getExperience();
    }
}
