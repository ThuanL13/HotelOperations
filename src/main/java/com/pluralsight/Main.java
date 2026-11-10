package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Testing Room
        Room room = new Room(2, 150.00, false, false);

        System.out.println("\n=== Room ===");
        System.out.println("Beds: " + room.getNumberOfBeds());
        System.out.println("Price: $" + room.getPrice());
        System.out.println("Occupied: " + room.isOccupied());
        System.out.println("Dirty: " + room.isDirty());
        System.out.println("Available: " + room.isAvailable());

        System.out.println();

        room.checkIn();
        room.checkOut();
        room.cleanRoom();

        System.out.println("Room Available: " + room.isAvailable());

        // Testing Reservation
        Reservation reservation = new Reservation("king", 3, true);

        System.out.println("\n=== Reservation ===");
        System.out.println("Room Type: " + reservation.getRoomType());
        System.out.println("Nightly Price: " + reservation.getPrice());
        System.out.println("Nights: " + reservation.getNumberOfNights());
        System.out.println("Weekend Stay: " + reservation.isWeekend());
        System.out.println("Reservation Total: $" + reservation.getReservationTotal());

        System.out.println();


        // Employees testing

        Employee employee = new Employee(67, "Michael Trevino",
                "Reception", 24, 0);
        // Day 1
//        employee.punchTimeCard(8);
//        employee.punchTimeCard(20); // 12 hours
        employee.punchIn(8);
        employee.punchOut(20);
        //Day 2
//        employee.punchTimeCard(8);
//        employee.punchTimeCard(20); // 12 hours
        employee.punchIn(8);
        employee.punchOut(20);

        //Day 3
        employee.punchIn(8);
        employee.punchOut(24);

        //Day 4
        employee.punchIn(8);
        employee.punchOut(24);


        System.out.println("\n=== Employee ===");
        System.out.println("Employee Id: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Regular Hours: " + employee.getHoursWorked());
        System.out.println("Overtime: " + employee.getOvertimeHours());
        System.out.println("Total Pay: $" + employee.getTotalPay());

        Hotel hotel = new Hotel("Fat Cat Hotel", 15, 50);
        hotel.bookRoom(3, true);
        hotel.bookRoom(20,false);
        System.out.println("\n=== Fat Cat Hotel ===");
        System.out.println("Available Suites: " + hotel.getAvailableSuites());
        System.out.println("Available Rooms: " + hotel.getAvailableRooms());
    }
}
