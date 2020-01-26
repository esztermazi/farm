package com.codecool.avril.plants;

import com.codecool.avril.PlantStatus;
import com.codecool.avril.SpecialProductionPlant;

public class AlmondTree extends Plant implements SpecialProductionPlant {
    private static final int PRODUCTION_INCREASEMENT = 10;
    private static final int PRODUCTION_DECREASEMENT = 18;
    private static final int PRODUCTION_BOUNDARY = 40;
    private PlantStatus plantStatus;



    public AlmondTree(String name) {
        super(name);
        this.foodProducedPerMonth = 50;
        plantStatus = new PlantStatus(8, 13);

    }

    public void prepareForMonth() {
        plantStatus.updateStatus();
        plantStatus.changeProduction(this);
        if (this.currentProduction < PRODUCTION_BOUNDARY){
            doubleProduction();
        }
        this.currentProduction = foodProducedPerMonth + productionIncreaser;
    }

    public void increaseProduction() {
        this.currentProduction += PRODUCTION_INCREASEMENT;
    }


    public void decreaseProduction() {
        this.currentProduction -= PRODUCTION_DECREASEMENT;
    }


    public void doubleProduction() {
            this.currentProduction += currentProduction;
    }

    @Override
    public int getCurrentProduction(){
        if (plantStatus.hasPlantRot()){
            return 0;
        }
        return currentProduction;
    }


    @Override
    public String toString() {
        return "AlmondTree{" +
                "currentProduction=" + currentProduction +
                ", foodProducedPerMonth=" + foodProducedPerMonth +
                ", productionIncreaser=" + productionIncreaser +
                ", name='" + name + '\'' +
                '}';
    }

}
