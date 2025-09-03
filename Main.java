import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        RentalSystem system = new RentalSystem();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Vehicle Rental Booking System ---");
            System.out.println("1. Add Vehicle");
            System.out.println("2. Register Customer");
            System.out.println("3. Book Vehicle");
            System.out.println("4. Show All Bookings");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: system.addVehicle(); break;
                case 2: system.registerCustomer(); break;
                case 3: system.bookVehicle(); break;
                case 4: system.showBookings(); break;
                case 5: System.out.println("Exiting system. Goodbye!"); break;
                default: System.out.println("Invalid choice.\n");
            }
        } while (choice != 5);
    }
}
