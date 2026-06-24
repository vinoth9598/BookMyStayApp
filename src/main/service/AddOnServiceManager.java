package main.service;

import main.model.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddOnServiceManager {

    // Reservation ID -> List of Services
    private final Map<String, List<Service>> reservationServices;

    public AddOnServiceManager() {
        reservationServices = new HashMap<>();
    }

    public void addService(String reservationId, Service service) {
        reservationServices.computeIfAbsent(reservationId, key -> new ArrayList<>()).add(service);
        System.out.println(service.getServiceName() + " added to Reservation " + reservationId);
    }

    public void displayServices(String reservationId) {
        List<Service> services = reservationServices.get(reservationId);
        if (services == null || services.isEmpty()) {
            System.out.println("No services added for Reservation " + reservationId);
            return;
        }
        System.out.println("\nServices for Reservation " + reservationId);
        for (Service service : services) {
            System.out.println(service);
        }
    }

    public double calculateAdditionalCost(String reservationId) {
        List<Service> services = reservationServices.get(reservationId);
        if (services == null) {
            return 0;
        }
        double totalCost = 0;
        for (Service service : services) {
            totalCost += service.getCost();
        }
        return totalCost;
    }

    public void displayTotalServiceCost(String reservationId) {
        System.out.println("\nAdditional Cost for Reservation " + reservationId + " : ₹" + calculateAdditionalCost(reservationId));
    }
}