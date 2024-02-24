package com.n11.entities;

import com.n11.entities.enums.BuildType;

public class SummerHouse extends BuildingSystem{
    public SummerHouse() {
        super();
    }

    public SummerHouse(int numberOfRooms, int numberOfSaloonRooms, int totalLivingAreaInSquareMeters, double price) {
        super(numberOfRooms, numberOfSaloonRooms, totalLivingAreaInSquareMeters, price);
    }

    @Override
    public BuildType getBuildType() {
        return BuildType.SUMMER_HOUSE;
    }
}
