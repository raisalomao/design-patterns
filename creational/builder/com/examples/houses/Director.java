package com.examples.houses;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void constructBasicHouse() {
        builder.buildWindows();
        builder.buildDoors();
        builder.buildRooms();
        builder.buildWalls();
        builder.buildRoof();
    }

    public void constructHouseWithGarage() {
        builder.buildWindows();
        builder.buildDoors();
        builder.buildRooms();
        builder.buildWalls();
        builder.buildRoof();
        builder.buildGarage();
    }

}
