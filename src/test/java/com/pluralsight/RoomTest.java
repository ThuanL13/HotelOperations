package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn() { // Occupies and dirties room
        Room room = new Room(2,150,false,false);
        room.checkIn();
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }
    @Test
    void occupiedRoomCannotBeCheckedIn() {
        Room room = new Room(2,150,true,false);
        room.checkIn();
        assertTrue(room.isOccupied());
        assertFalse(room.isAvailable());
    }

    @Test
    void dirtyRoomCannotBeCheckedIn() {
        Room room = new Room(2,150,false,true);
        room.checkIn();
        assertTrue(room.isDirty());
        assertFalse(room.isAvailable());
    }

    @Test
    void checkOut() { // Makes room unoccupied
        Room room = new Room(2,150,true, true);
        room.checkOut();
        assertFalse(room.isOccupied());
    }

    @Test
    void cleanRoom() { // Removes dirty
        Room room = new Room(2,150,false,true);
        room.cleanRoom();
        assertFalse(room.isDirty());
    }
    @Test
    void cleanRoomMakesRoomAvailable() {
        Room room = new Room(2,150,false,true);
        room.cleanRoom();
        assertTrue(room.isAvailable());
    }
}