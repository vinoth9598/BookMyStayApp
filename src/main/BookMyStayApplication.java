package main;

import main.model.Reservation;
import main.service.BookingHistoryService;

public class BookMyStayApplication {

    public static void main(String[] args) {

        BookingHistoryService historyService =
                new BookingHistoryService();

        Reservation reservation1 =
                new Reservation(
                        "Anbu",
                        "Single");

        Reservation reservation2 =
                new Reservation(
                        "Raj",
                        "Double");

        Reservation reservation3 =
                new Reservation(
                        "Kumar",
                        "Suite");

        historyService.addReservation(
                reservation1);

        historyService.addReservation(
                reservation2);

        historyService.addReservation(
                reservation3);

        historyService.displayBookingHistory();

        historyService.cancelReservation(
                "Raj");

        historyService.displayBookingHistory();

        historyService.generateReport();
    }
}