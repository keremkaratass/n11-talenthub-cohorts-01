package com.n11.service;

import com.n11.entities.BuildingSystem;
import com.n11.entities.enums.BuildType;

import java.util.List;

public interface BuildingSystemService {
    double getTotalPriceOfBuildsByType(BuildType buildType);

    double getTotalPriceOfAllBuilds();

    double getAverageSquareMetersOfBuildsByType(BuildType buildType);

    double getAverageSquareMetersOfAllBuilds();

    List<BuildingSystem> filterPropertiesByRoomAndLivingRoom(int numberOfRooms, int numberOfSaloonRooms, BuildType buildType);

}
