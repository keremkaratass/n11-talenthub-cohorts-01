package com.n11;

import com.n11.data.BuildingSystemMockData;
import com.n11.entities.BuildingSystem;
import com.n11.entities.enums.BuildType;
import com.n11.service.BuildingSystemService;
import com.n11.service.impl.BuildingSystemServiceImpl;
import lombok.extern.slf4j.Slf4j;


import java.util.List;





@Slf4j
public class Main {

    public static void main(String[] args) {

        List<BuildingSystem> buildingSystemList = BuildingSystemMockData.getBuildingSystemList();

        BuildingSystemService buildingSystemService = new BuildingSystemServiceImpl(buildingSystemList);
        log.info("Building system information: ");
        buildingSystemList.forEach(buildingSystem -> log.info(buildingSystem.toString()));
        log.info(String.format("Total price of all houses out of all properties in the system: %.2f", buildingSystemService.getTotalPriceOfBuildsByType(BuildType.HOUSE)));
        log.info(String.format("Total price of all villas out of all properties in the system: %.2f", buildingSystemService.getTotalPriceOfBuildsByType(BuildType.VILLA)));
        log.info(String.format("Total price of all summer cottages out of all properties in the system: %.2f",buildingSystemService.getTotalPriceOfBuildsByType(BuildType.SUMMER_HOUSE)));
        log.info(String.format("Total price of all types of properties in the system: %.2f", buildingSystemService.getTotalPriceOfAllBuilds()));
        log.info("-----------------------------------------------------------------------------------------------------");
        log.info(String.format("Average living area in square meters of all houses out of all properties in the system: %.2f", buildingSystemService.getAverageSquareMetersOfBuildsByType(BuildType.HOUSE)));
        log.info(String.format("Average living area in square meters of all villas out of all properties in the system: %.2f", buildingSystemService.getAverageSquareMetersOfBuildsByType(BuildType.VILLA)));
        log.info(String.format("Average living area in square meters of all summer cottages out of all properties in the system: %.2f", buildingSystemService.getAverageSquareMetersOfBuildsByType(BuildType.SUMMER_HOUSE)));
        log.info(String.format("Average living area in square meters of all types of properties in the system: %.2f", buildingSystemService.getAverageSquareMetersOfAllBuilds()));
        log.info("-----------------------------------------------------------------------------------------------------");

    }
}