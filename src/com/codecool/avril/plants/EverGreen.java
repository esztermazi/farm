package com.codecool.avril.plants;

import com.codecool.avril.PlantStatus;

public abstract class EverGreen extends Plant {
    protected int productionIncreaserForEverGreens = 8;

    public EverGreen(String name) {
        super(name);
    }

    public void prepareForMonth() {
        if (isFullProduction()) {
            speak();
        } else {
            this.currentProduction = this.productionIncreaser + productionIncreaserForEverGreens;
        }
    }


    public void speak() {
        System.out.println(this.getName() + "at full production");
    }

    public boolean isFullProduction() {
        return (this.currentProduction >= 70);
    }

}
