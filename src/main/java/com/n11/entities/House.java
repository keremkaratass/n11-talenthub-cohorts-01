package com.n11.entities;

import com.n11.entities.enums.BuildType;

public class House extends BuildingSystem{

    public House() {
        super();
    }

    public House(int numberOfRooms, int numberOfSaloonRooms, int totalLivingAreaInSquareMeters, double price) {
        super(numberOfRooms, numberOfSaloonRooms, totalLivingAreaInSquareMeters, price);
    }

    @Override
    public BuildType getBuildType() {
        return BuildType.HOUSE;
    }
}
