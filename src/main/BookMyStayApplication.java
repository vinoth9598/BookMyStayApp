package main;

import main.service.BookingQueueService;

public class BookMyStayApplication {

    public static void main(String[] args) {

        BookingQueueService bookingService =
                new BookingQueueService();

        bookingService.addBookingRequest(
                "Anbu",
                "Single");

        bookingService.addBookingRequest(
                "Raj",
                "Double");

        bookingService.addBookingRequest(
                "Kumar",
                "Suite");

        bookingService.displayWaitingRequests();

        System.out.println(
                "\nPending Requests : "
                        + bookingService.getPendingRequestCount());

        System.out.println(
                "\nProcessing Requests...");

        bookingService.processNextRequest();
        bookingService.processNextRequest();

        bookingService.displayWaitingRequests();
    }
}