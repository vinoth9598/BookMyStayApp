package main;

import main.service.InventoryService;
import main.service.SearchService;

public class BookMyStayApplication {

    public static void main(String[] args) {

        InventoryService inventoryService =
                new InventoryService();

        inventoryService.addRoomType(
                "Single",
                20,
                2500,
                "WiFi, TV");

        inventoryService.addRoomType(
                "Double",
                15,
                4500,
                "WiFi, TV, Breakfast");

        inventoryService.addRoomType(
                "Suite",
                0,
                9000,
                "WiFi, TV, Spa Access");

        SearchService searchService =
                new SearchService(
                        inventoryService.getRoomInventory());

        searchService.displayAvailableRooms();

        searchService.searchRoom("Double");

        System.out.println(
                "\nIs Suite Available ? "
                        + searchService.isRoomAvailable("Suite"));
    }
}