package com.codecool.avril.plants;

import com.codecool.avril.PlantStatus;
import com.codecool.avril.SpecialProductionPlant;

public class Spruce extends EverGreen implements SpecialProductionPlant {
    private static final int PRODUCTION_INCREASEMENT = 15;
    private static final int PRODUCTION_DECREASEMENT = 20;
    private PlantStatus plantStatus;

    public Spruce(String name) {
        super(name);
        this.foodProducedPerMonth = 26;
        plantStatus = new PlantStatus(5, 4);
    }


    @Override
    public void prepareForMonth() {
        plantStatus.updateStatus();
        plantStatus.changeProduction(this);
        if (isFullProduction()) {
            speak();
        } else {
            this.currentProduction = foodProducedPerMonth + productionIncreaser + productionIncreaserForEverGreens;
        }
    }

    public void increaseProduction() {
        if (!isFullProduction()) {
            this.currentProduction += PRODUCTION_INCREASEMENT;
        }
    }

    @Override
    public int getCurrentProduction(){
        if (plantStatus.hasPlantRot()){
            return 0;
        }
        return currentProduction;
    }


    public void decreaseProduction() {
        this.currentProduction -= PRODUCTION_DECREASEMENT;
    }

    @Override
    public String toString() {
        return "Spruce{" +
                "currentProduction=" + currentProduction +
                ", foodProducedPerMonth=" + foodProducedPerMonth +
                ", productionIncreaser=" + productionIncreaser +
                ", name='" + name + '\'' +
                '}';
    }
}
