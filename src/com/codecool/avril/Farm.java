package com.codecool.avril;

import com.codecool.avril.plants.*;

import java.util.ArrayList;

public class Farm {
    ArrayList<Plant> plants;
    private int totalProduction;

    public Farm() {
        this.plants = new ArrayList<>();
        this.totalProduction = 0;
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }


    public void operateForOneMonth() {

        for (Plant plant : plants) {
            plant.prepareForMonth();
            totalProduction += plant.getCurrentProduction();
            System.out.println(plant.toString());
            System.out.println("Total production til this month: " + totalProduction);
        }
    }

    public int getTotalProduction() {
        return totalProduction;
    }

}


