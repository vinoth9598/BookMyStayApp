package main;

import main.service.InventoryService;

public class BookMyStayApplication {

    public static void main(String[] args) {

        InventoryService inventoryService =
                new InventoryService();

        inventoryService.addRoomType(
                "Single",
                20,
                2500);

        inventoryService.addRoomType(
                "Double",
                15,
                4000);

        inventoryService.addRoomType(
                "Suite",
                5,
                8000);

        inventoryService.displayInventory();

        inventoryService.updateRoomCount(
                "Single",
                18);

        inventoryService.updateRoomPrice(
                "Suite",
                9000);

        System.out.println(
                "\nAvailable Single Rooms: "
                        + inventoryService.getAvailableRooms("Single"));

        inventoryService.displayInventory();
    }
}
