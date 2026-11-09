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
                "Reception", 24, 45);

        System.out.println("\n=== Employee ===");
        System.out.println("Employee Id: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Regular Hours: " + employee.getHoursWorked());
        System.out.println("Overtime: " + employee.getOvertimeHours());
        System.out.println("Total Pay: $" + employee.getTotalPay());
    }
}
