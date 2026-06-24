package main.service;

import main.model.Reservation;

import java.util.LinkedList;
import java.util.Queue;

public class BookingQueueService {

    private final Queue<Reservation> bookingQueue;

    public BookingQueueService() {
        bookingQueue = new LinkedList<>();
    }

    public void addBookingRequest(String guestName, String roomType) {
        Reservation reservation = new Reservation(guestName, roomType);
        bookingQueue.offer(reservation);
        System.out.println("Booking request added for " + guestName);
    }

    public void processNextRequest() {
        if (bookingQueue.isEmpty()) {
            System.out.println("No booking requests available.");
            return;
        }
        Reservation reservation = bookingQueue.poll();
        System.out.println("Processing Booking -> " + reservation);
    }

    public void displayWaitingRequests() {
        System.out.println("\n===== BOOKING QUEUE =====");
        if (bookingQueue.isEmpty()) {
            System.out.println("No pending booking requests.");
            return;
        }
        for (Reservation reservation : bookingQueue) {
            System.out.println(reservation);
        }
    }

    public int getPendingRequestCount() {
        return bookingQueue.size();
    }
}