package com.n11.service.impl;

import com.n11.entities.BuildingSystem;
import com.n11.entities.enums.BuildType;
import com.n11.service.BuildingSystemService;

import java.util.ArrayList;
import java.util.List;

public class BuildingSystemServiceImpl implements BuildingSystemService {
    private final List<BuildingSystem> buildingSystemList;

    public BuildingSystemServiceImpl(List<BuildingSystem> buildingSystemList) {
        this.buildingSystemList = buildingSystemList;
    }

    @Override
    public double getTotalPriceOfBuildsByType(BuildType buildType) {
        double totalPrice = 0;
        for (BuildingSystem buildingSystem:buildingSystemList){
            if (buildType == null || buildingSystem.getBuildType() == buildType) {
                totalPrice += buildingSystem.getPrice();
            }
        }
        return totalPrice;
    }

    @Override
    public double getTotalPriceOfAllBuilds() {
        double price = 0;
        for (BuildType buildType : BuildType.values()) {
            price += getTotalPriceOfBuildsByType(buildType);
        }
        return price;
    }

    @Override
    public double getAverageSquareMetersOfBuildsByType(BuildType buildType) {
        double totalSquareMeters = 0;
        int count = 0;

        for (BuildingSystem buildingSystem : buildingSystemList){
            if (buildType ==null || buildingSystem.getBuildType() == buildType){
                totalSquareMeters += buildingSystem.getTotalLivingAreaInSquareMeters();
                count++;
            }
        }

        return count > 0 ? totalSquareMeters / count : 0;
    }

    @Override
    public double getAverageSquareMetersOfAllBuilds() {
        double totalSquareMeters = 0;
        int count = 0;

        for (BuildType buildType : BuildType.values()) {
            totalSquareMeters += getAverageSquareMetersOfBuildsByType(buildType);
            count++;
        }
        return count > 0 ? totalSquareMeters  / count : 0;
    }

    @Override
    public List<BuildingSystem> filterPropertiesByRoomAndLivingRoom(int numberOfRooms, int numberOfSaloonRooms, BuildType buildType) {
        List<BuildingSystem> filteredBuilds = new ArrayList<>();
        for (BuildingSystem buildingSystem :  buildingSystemList) {
            if (buildingSystem.getBuildType() == buildType &&
                    buildingSystem.getNumberOfRooms() == numberOfRooms && buildingSystem.getNumberOfSaloonRooms() == numberOfSaloonRooms){
                filteredBuilds.add(buildingSystem);
            }
        }
        return filteredBuilds;
    }


}
