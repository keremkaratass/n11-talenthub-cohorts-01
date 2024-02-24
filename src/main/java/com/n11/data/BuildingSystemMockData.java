package com.n11.data;

import com.n11.entities.BuildingSystem;
import com.n11.entities.House;
import com.n11.entities.SummerHouse;
import com.n11.entities.Villa;

import java.util.ArrayList;
import java.util.List;

public final class BuildingSystemMockData {
    private static final List<BuildingSystem> BUILDING_SYSTEM_LIST = new ArrayList<>();

    static {
        loadMockData();
    }

    private BuildingSystemMockData() {

    }

    public static List<BuildingSystem> getBuildingSystemList() {
        return BUILDING_SYSTEM_LIST;
    }

    private static void loadMockData(){
        BUILDING_SYSTEM_LIST.add(new House(1,1,100, 10000));
        BUILDING_SYSTEM_LIST.add(new House(2,1,100, 10000));
        BUILDING_SYSTEM_LIST.add(new House(2,2,200, 14000));
        BUILDING_SYSTEM_LIST.add(new House(4,3,300, 15000));
        BUILDING_SYSTEM_LIST.add(new Villa(1,1,100, 10000));
        BUILDING_SYSTEM_LIST.add(new Villa(2,1,100, 10000));
        BUILDING_SYSTEM_LIST.add(new Villa(2,2,200, 14000));
        BUILDING_SYSTEM_LIST.add(new Villa(4,3,300, 15000));
        BUILDING_SYSTEM_LIST.add(new SummerHouse(1,1,100, 10000));
        BUILDING_SYSTEM_LIST.add(new SummerHouse(2,1,100, 10000));
        BUILDING_SYSTEM_LIST.add(new SummerHouse(2,2,200, 14000));
        BUILDING_SYSTEM_LIST.add(new SummerHouse(4,3,300, 15000));
    }
}
