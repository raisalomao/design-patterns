package com.examples.houses;

public class Client {
    public static void main(String[] args) {
        
		// Construct a basic house
		BasicHouseBuilder builder = new BasicHouseBuilder();
		Director director = new Director(builder);
		director.constructBasicHouse();
		House basicHouse = builder.getHouse();
		System.out.println(
			"Basic House: " + basicHouse.getWindows() + " windows, " + 
			basicHouse.getDoors() + " doors, " + basicHouse.getRoom() + " rooms, " + 
			basicHouse.getWalls() + " walls, " + basicHouse.getRoof() + ", Garage: " + 
			basicHouse.getGarage()
		);
		
		// Construct a house with garage
		GarageHouseBuilder garageBuilder = new GarageHouseBuilder();
		Director director2 = new Director(garageBuilder);
		director2.constructHouseWithGarage();
		House houseWithGarage = garageBuilder.getHouse();
		System.out.println(
			"House with Garage: " + houseWithGarage.getWindows() + " windows, " + 
			houseWithGarage.getDoors() + " doors, " + houseWithGarage.getRoom() + " rooms, " + 
			houseWithGarage.getWalls() + " walls, " + houseWithGarage.getRoof() + ", Garage: " + 
			houseWithGarage.getGarage()
		);

    }
	
}