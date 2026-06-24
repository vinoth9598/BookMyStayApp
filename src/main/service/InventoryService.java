package main.service;

import main.model.Room;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {

    private final Map<String, Room> roomInventory = new HashMap<>();

    public void addRoomType(String roomType, int count, double price, String amenities) {

        roomInventory.put(
                roomType, new Room(roomType, count, price, amenities));
    }

    public Map<String, Room> getRoomInventory() {
        return roomInventory;
    }

    public void displayInventory() {
        System.out.println("\n===== HOTEL INVENTORY =====");
        for (Room room : roomInventory.values()) {
            System.out.println(room);
            System.out.println("--------------------------");
        }
    }
}