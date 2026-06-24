package main.model;

public class Room {

    private String roomType;
    private int availableCount;
    private double pricePerNight;
    private String amenities;

    public Room(String roomType, int availableCount, double pricePerNight, String amenities) {
        this.roomType = roomType;
        this.availableCount = availableCount;
        this.pricePerNight = pricePerNight;
        this.amenities = amenities;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getAmenities() {
        return amenities;
    }

    @Override
    public String toString() {
        return "Room Type : " + roomType +
                "\nAvailable Rooms : " + availableCount +
                "\nPrice Per Night : ₹" + pricePerNight +
                "\nAmenities : " + amenities;
    }
}