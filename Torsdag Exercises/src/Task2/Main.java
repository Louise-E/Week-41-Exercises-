package Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        //2.g
        Room room1 = new Room(4, 1, 1, 1);
        Room room2 = new Room(4, 1, 3, 1);
        Room room3 = new Room(4, 1, 2, 1);
        ArrayList<Room> rooms = new ArrayList<>();
        //2.i
        Building building = new Building(rooms, 3, 4, true);
        //2.h
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        int lamps = 0;

        //2.j
        for (Room r: building.getRooms() )
        {
            lamps += r.getNumberOfLamps();
        }
        if (building.getNumberOfFloors() > building.getRooms().size()){
            System.out.println("This is an odd building");

        }

        System.out.println("Total number of lamps " + lamps);

    }
}
