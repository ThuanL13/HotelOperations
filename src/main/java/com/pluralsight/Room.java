package com.pluralsight;

public class Room {
    // Variables
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    // Constructor

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }
    // Derived getter (using occupied and dirty)
    public boolean isAvailable() {
        return !occupied && !dirty;
    }
    public void checkIn() {
        if (isAvailable()) { // If room is available and guests check in, room becomes occupied and will be dirty
            occupied = true;
            dirty = true;
        }
    }
    public void checkOut() {
        occupied = false;

    }
    public void cleanRoom() {
        if (!occupied) {
            dirty = false;
        }
    }
}
