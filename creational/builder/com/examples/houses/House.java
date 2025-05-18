package com.examples.houses;

public class House {
    
    private int windows;
    private int doors;
    private int room;
    private int walls;
    private String roof;
    private String garage;

    public House(int windows, int doors, int room) {
        this.windows = windows;
        this.doors = doors;
        this.room = room;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getWalls() {
        return walls;
    }
    
    public void setWalls(int walls) {
        this.walls = walls;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

}