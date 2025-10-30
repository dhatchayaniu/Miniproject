public class Booking {
    private Vehicle vehicle;
    private Customer customer;
    private int days;
    private double totalCost;

    public Booking(Vehicle vehicle, Customer customer, int days) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
        this.totalCost = vehicle.calculateRent(days);
        vehicle.setAvailable(false);
    }

    public void displayBookingDetails() {
        System.out.println("----- Booking Details -----");
        customer.displayDetails();
        vehicle.displayDetails();
        System.out.println("Days: " + days + " | Total Cost: ₹" + totalCost);
        System.out.println("---------------------------");
    }
}
