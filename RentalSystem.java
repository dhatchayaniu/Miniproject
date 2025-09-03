import java.util.*;

public class RentalSystem {
    private List<Vehicle> vehicles = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addVehicle() {
        System.out.print("Enter Vehicle Type (Car/Bike): ");
        String type = sc.next();
        System.out.print("Enter Vehicle ID: ");
        String id = sc.next();
        System.out.print("Enter Brand: ");
        String brand = sc.next();
        System.out.print("Enter Rent per Day: ");
        double rent = sc.nextDouble();

        Vehicle v = type.equalsIgnoreCase("Car") ? new Car(id, brand, rent) : new Bike(id, brand, rent);
        vehicles.add(v);
        System.out.println(type + " added successfully.\n");
    }

    public void registerCustomer() {
        System.out.print("Enter Customer ID: ");
        String id = sc.next();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Contact: ");
        String contact = sc.next();

        customers.add(new Customer(id, name, contact));
        System.out.println("Customer registered successfully.\n");
    }

    public void bookVehicle() {
        System.out.print("Enter Customer ID: ");
        String custId = sc.next();
        Customer customer = findCustomer(custId);
        if (customer == null) {
            System.out.println("Customer not found.\n");
            return;
        }

        System.out.println("Available Vehicles:");
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) v.displayDetails();
        }

        System.out.print("Enter Vehicle ID to book: ");
        String vehId = sc.next();
        Vehicle vehicle = findVehicle(vehId);
        if (vehicle == null || !vehicle.isAvailable()) {
            System.out.println("Vehicle not available.\n");
            return;
        }

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        Booking booking = new Booking(vehicle, customer, days);
        bookings.add(booking);
        System.out.println("Booking successful!\n");
        booking.displayBookingDetails();
    }

    private Customer findCustomer(String id) {
        for (Customer c : customers) {
            if (c.getCustomerId().equals(id)) return c;
        }
        return null;
    }

    private Vehicle findVehicle(String id) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleId().equals(id)) return v;
        }
        return null;
    }

    public void showBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.\n");
            return;
        }
        for (Booking b : bookings) {
            b.displayBookingDetails();
        }
    }
}
