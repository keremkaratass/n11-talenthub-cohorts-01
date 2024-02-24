package com.n11.entities;

import com.n11.entities.enums.BuildType;

public class Villa extends BuildingSystem{
    public Villa() {
        super();
    }

    public Villa(int numberOfRooms, int numberOfSaloonRooms, int totalLivingAreaInSquareMeters, double price) {
        super(numberOfRooms, numberOfSaloonRooms, totalLivingAreaInSquareMeters, price);
    }

    @Override
    public BuildType getBuildType() {
        return BuildType.VILLA;
    }
}
