package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {

    private int maxSpeed;

    public SportCar(String carModel, String carClass, int weight, Engine engine, Driver driver, int maxSpeed) {

        super(carModel, carClass, weight, engine, driver);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
