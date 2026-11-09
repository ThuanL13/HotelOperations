package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
    // Derived getter for price
    public double getPrice() {
        double price;
        if (roomType.equalsIgnoreCase("king")) {
            price = 139.00;
        }else {
            price = 124.00;
        }
        if (weekend) {
            price *= 1.10; // 100% of original price + 10% increase
        }
        return price;
    }
    // Derived getter for total reservation cost
    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }
}
