package com.n11.entities;

import com.n11.entities.enums.BuildType;

public abstract class BuildingSystem {
    private int numberOfRooms;
    private int numberOfSaloonRooms;
    private int totalLivingAreaInSquareMeters;
    private double price;

    protected BuildingSystem() {
        this.numberOfRooms = 0;
        this.numberOfSaloonRooms = 0;
        this.totalLivingAreaInSquareMeters = 0;
        this.price = 0;
    }

    protected BuildingSystem(int numberOfRooms, int numberOfSaloonRooms, int totalLivingAreaInSquareMeters, double price) {
        this.numberOfRooms = numberOfRooms;
        this.numberOfSaloonRooms = numberOfSaloonRooms;
        this.totalLivingAreaInSquareMeters = totalLivingAreaInSquareMeters;
        this.price = price;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfSaloonRooms(int numberOfSaloonRooms) {
        this.numberOfSaloonRooms = numberOfSaloonRooms;
    }

    public int getNumberOfSaloonRooms() {
        return numberOfSaloonRooms;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setTotalLivingAreaInSquareMeters(int totalLivingAreaInSquareMeters) {
        this.totalLivingAreaInSquareMeters = totalLivingAreaInSquareMeters;
    }

    public double getTotalLivingAreaInSquareMeters() {
        return totalLivingAreaInSquareMeters;
    }

    @Override
    public String toString() {
        return getBuildType() + "{" + "numberOfRooms=" + numberOfRooms + ", numberOfSaloonRooms=" + numberOfSaloonRooms + ", totalLivingAreaInSquareMeters=" + totalLivingAreaInSquareMeters + ", price=" + price + '}';
    }

    public abstract BuildType getBuildType();
}
