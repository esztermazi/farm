package com.codecool.avril;

import java.util.Random;

public class PlantStatus {
    private boolean isRot;
    private boolean isShroomGrew;
    private final int chanceOfShroom;
    private final int chanceOfRot;

    public PlantStatus(int chanceOfShroom, int chanceOfRot) {
        this.chanceOfShroom = chanceOfShroom;
        this.chanceOfRot = chanceOfRot;
        this.isRot = false;
        this.isShroomGrew = false;
    }


    public void updateStatus() {
        this.isShroomGrew = new Random().nextInt(100) < chanceOfShroom;
        this.isRot = new Random().nextInt(100) < chanceOfRot;
    }

    public boolean hasShroomGrew() {
        return isShroomGrew;

    }

    public boolean hasPlantRot() {
        return isRot;
    }

    public void changeProduction(SpecialProductionPlant plant){
        if (this.hasShroomGrew()) {
            plant.increaseProduction();
        }
        if (this.hasPlantRot()) {
            plant.decreaseProduction();
        }
    }

}
