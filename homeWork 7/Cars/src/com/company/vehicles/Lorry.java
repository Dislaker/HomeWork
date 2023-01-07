package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {

    private int carrying;

    public Lorry(String carModel, String carClass, int weight, Engine engine, Driver driver, int carrying) {

        super(carModel, carClass, weight, engine, driver);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }
}
