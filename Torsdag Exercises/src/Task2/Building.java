package Task2;

import java.util.ArrayList;

public class Building {
    //2.d
    private ArrayList<Room> rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficebuiling;

    //2.e
    public Building(ArrayList<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficebuiling){
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficebuiling = isOfficebuiling;
    }
//2.f
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isOfficebuiling() {
        return isOfficebuiling;
    }
}
