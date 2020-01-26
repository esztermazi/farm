package com.codecool.avril;

import com.codecool.avril.plants.AlmondTree;
import com.codecool.avril.plants.Juniper;
import com.codecool.avril.plants.Spruce;

public class Main {

    private static void createPlants(Farm farm) {
        for (int i = 0; i < 3; i++) {
            farm.addPlant(new Juniper("juniper" + i));
            farm.addPlant(new Spruce("spruce" + i));
            farm.addPlant(new AlmondTree("almondTree" + i));
        }

    }

    public static void main(String[] args) {
        // write your code here
        Farm farm = new Farm();
        createPlants(farm);
        for (int i = 1; i < 81; i++) {
            System.out.println("Month: " + i);
            farm.operateForOneMonth();
        }
        System.out.println("Total production: " + farm.getTotalProduction());
    }
}
