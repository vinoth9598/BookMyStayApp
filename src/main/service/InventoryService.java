package main.service;

import main.model.Room;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {

    private final Map<String, Room> roomInventory = new HashMap<>();

    public void addRoomType(String roomType, int count, double price) {
        if (roomInventory.containsKey(roomType)) {
            System.out.println("Room type already exists.");
            return;
        }
        roomInventory.put(roomType,
                new Room(roomType, count, price));
        System.out.println(roomType + " added successfully.");
    }

    public void updateRoomCount(String roomType, int count) {
        Room room = roomInventory.get(roomType);
        if (room == null) {
            System.out.println("Room type not found.");
            return;
        }
        room.setAvailableCount(count);
        System.out.println("Inventory updated.");
    }

    public void updateRoomPrice(String roomType, double price) {
        Room room = roomInventory.get(roomType);
        if (room == null) {
            System.out.println("Room type not found.");
            return;
        }
        room.setPricePerNight(price);
        System.out.println("Price updated.");
    }

    public int getAvailableRooms(String roomType) {
        Room room = roomInventory.get(roomType);
        return room != null ? room.getAvailableCount() : 0;
    }

    public void displayInventory() {
        System.out.println("\n===== ROOM INVENTORY =====");
        for (Room room : roomInventory.values()) {
            System.out.println(room);
        }
    }
}