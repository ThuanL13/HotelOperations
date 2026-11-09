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

}
