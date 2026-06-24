package main.service;

import main.model.Reservation;

import java.util.ArrayList;
import java.util.List;

public class BookingHistoryService {

    private final List<Reservation> bookingHistory;

    public BookingHistoryService() {
        bookingHistory = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        bookingHistory.add(reservation);
        System.out.println("Reservation added to booking history.");
    }

    public void displayBookingHistory() {
        System.out.println("\n===== BOOKING HISTORY =====");
        if (bookingHistory.isEmpty()) {
            System.out.println("No reservations found.");
            return;
        }
        for (Reservation reservation : bookingHistory) {
            System.out.println(reservation);
        }
    }

    public void cancelReservation(String guestName) {
        boolean removed = bookingHistory.removeIf(
                reservation -> reservation.getGuestName().equalsIgnoreCase(guestName));
        if (removed) {
            System.out.println("Reservation cancelled for " + guestName);
        } else {
            System.out.println("Reservation not found.");
        }
    }

    public void generateReport() {
        System.out.println("\n===== BOOKING REPORT =====");
        System.out.println("Total Reservations : " + bookingHistory.size());
        for (Reservation reservation : bookingHistory) {
            System.out.println(reservation);
        }
    }
}