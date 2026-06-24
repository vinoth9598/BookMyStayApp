package main.service;

import main.model.Room;

import java.util.Map;

public class SearchService {

    private final Map<String, Room> roomInventory;

    public SearchService(Map<String, Room> roomInventory) {
        this.roomInventory = roomInventory;
    }

    public void displayAvailableRooms() {
        System.out.println("\n===== AVAILABLE ROOMS =====");
        boolean roomFound = false;
        for (Room room : roomInventory.values()) {
            if (room.getAvailableCount() > 0) {
                System.out.println(room);
                System.out.println("--------------------------");
                roomFound = true;
            }
        }
        if (!roomFound) {
            System.out.println("No rooms available.");
        }
    }

    public void searchRoom(String roomType) {
        Room room = roomInventory.get(roomType);
        if (room == null) {
            System.out.println("Room type not found.");
            return;
        }
        System.out.println("\n===== ROOM DETAILS =====");
        System.out.println(room);
        if (room.getAvailableCount() > 0) {
            System.out.println("Status : Available");
        } else {
            System.out.println("Status : Not Available");
        }
    }

    public boolean isRoomAvailable(String roomType) {
        Room room = roomInventory.get(roomType);
        return room != null &&
                room.getAvailableCount() > 0;
    }
}