package com.examples.houses;

public class GarageHouseBuilder implements Builder {
    
    private House house;
    
    public GarageHouseBuilder() {
        house = new House(0, 0, 0, "");
    }
    
    @Override
    public int buildWalls() {
        house.setWalls(4);
        return house.getWalls();
    }

    @Override
    public int buildWindows() {
        house.setWindows(2);
        return house.getWindows();
    }

    @Override
    public int buildDoors() {
        house.setDoors(1);
        return house.getDoors();
    }

    @Override
    public int buildRooms() {
        house.setRoom(3);
        return house.getRoom();
    }

    @Override
    public String buildRoof() {
        house.setRoof("Gable Roof");
        return house.getRoof();
    }
    
    public String buildGarage() {
        house.setGarage("2-car garage");
        return house.getGarage();
    }

    public House getHouse() {
        return house;
    }

}