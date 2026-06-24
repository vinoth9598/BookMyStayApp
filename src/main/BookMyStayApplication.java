package main;

import main.model.Reservation;
import main.service.InventoryService;
import main.service.ReservationConfirmationService;

public class BookMyStayApplication {

    public static void main(String[] args) {

        InventoryService inventoryService =
                new InventoryService();

        inventoryService.addRoomType(
                "Single",
                2,
                2500,
                "WiFi, TV");

        inventoryService.addRoomType(
                "Double",
                1,
                4500,
                "WiFi, TV, Breakfast");

        ReservationConfirmationService
                confirmationService =
                new ReservationConfirmationService(
                        inventoryService.getRoomInventory());

        Reservation reservation1 =
                new Reservation(
                        "Anbu",
                        "Single");

        Reservation reservation2 =
                new Reservation(
                        "Raj",
                        "Single");

        Reservation reservation3 =
                new Reservation(
                        "Kumar",
                        "Single");

        confirmationService
                .confirmReservation(
                        reservation1);

        confirmationService
                .confirmReservation(
                        reservation2);

        confirmationService
                .confirmReservation(
                        reservation3);

        confirmationService
                .displayAllocatedRooms();

        confirmationService
                .displayBookedRoomIds();

        inventoryService
                .displayInventory();
    }
}