package main.service;


import main.model.Reservation;
import main.model.Room;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReservationConfirmationService {

    private final Map<String, Room> roomInventory;

    // Room Type -> Assigned Room IDs
    private final Map<String, Set<String>> allocatedRooms;

    // All Assigned Room IDs
    private final Set<String> bookedRoomIds;

    public ReservationConfirmationService(Map<String, Room> roomInventory) {
        this.roomInventory = roomInventory;
        this.allocatedRooms = new HashMap<>();
        this.bookedRoomIds = new HashSet<>();
    }

    public void confirmReservation(Reservation reservation) {
        String roomType = reservation.getRoomType();
        Room room = roomInventory.get(roomType);
        if (room == null) {
            System.out.println("Invalid Room Type.");
            return;
        }
        if (room.getAvailableCount() <= 0) {
            System.out.println("No rooms available for " + roomType);
            return;
        }
        String roomId = generateRoomId(roomType);
        bookedRoomIds.add(roomId);
        allocatedRooms.computeIfAbsent(roomType, key -> new HashSet<>()).add(roomId);
        room.setAvailableCount(room.getAvailableCount() - 1);

        System.out.println("\nReservation Confirmed");
        System.out.println("Guest : " + reservation.getGuestName());
        System.out.println("Room Type : " + roomType);
        System.out.println("Room ID : " + roomId);
    }

    private String generateRoomId(String roomType) {
        int roomNumber = 1;
        String roomId = roomType.substring(0, 1).toUpperCase() + roomNumber;
        while (bookedRoomIds.contains(roomId)) {
            roomNumber++;
            roomId = roomType.substring(0, 1).toUpperCase() + roomNumber;
        }
        return roomId;
    }

    public void displayAllocatedRooms() {
        System.out.println("\n===== ALLOCATED ROOMS =====");
        for (Map.Entry<String, Set<String>> entry : allocatedRooms.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void displayBookedRoomIds() {
        System.out.println("\nBooked Room IDs : " + bookedRoomIds);
    }
}
