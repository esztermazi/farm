package com.codecool.avril.plants;

import com.codecool.avril.PlantStatus;

public abstract class Plant {
    protected int currentProduction;
    protected int foodProducedPerMonth;
    protected int productionIncreaser = 4;

    protected String name;


    public Plant(String name) {
        this.name = name;
    }

    public abstract void prepareForMonth();

    public String getName() {
        return name;
    }

    public int getCurrentProduction() {
        return currentProduction;
    }

    public abstract String toString();
}
