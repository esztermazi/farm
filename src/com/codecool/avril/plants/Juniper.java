package com.codecool.avril.plants;

public class Juniper extends EverGreen {


    public Juniper(String name) {
        super(name);
        this.foodProducedPerMonth = 14;
    }


    @Override
    public String toString() {
        return "Juniper{" +
                "currentProduction=" + currentProduction +
                ", foodProducedPerMonth=" + foodProducedPerMonth +
                ", productionIncreaser=" + productionIncreaser +
                ", name='" + name + '\'' +
                '}';
    }
}
