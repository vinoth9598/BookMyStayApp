package main;

import main.model.Service;
import main.service.AddOnServiceManager;

public class BookMyStayApplication {

    public static void main(String[] args) {

        AddOnServiceManager serviceManager =
                new AddOnServiceManager();

        String reservationId = "S1";

        serviceManager.addService(
                reservationId,
                new Service(
                        "Breakfast",
                        500));

        serviceManager.addService(
                reservationId,
                new Service(
                        "Spa",
                        1500));

        serviceManager.addService(
                reservationId,
                new Service(
                        "Airport Pickup",
                        800));

        serviceManager.displayServices(
                reservationId);

        serviceManager.displayTotalServiceCost(
                reservationId);
    }
}