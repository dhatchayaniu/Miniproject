public class Bike extends Vehicle {
    public Bike(String vehicleId, String brand, double rentPerDay) {
        super(vehicleId, brand, rentPerDay);
    }

    @Override
    public String getType() {
        return "Bike";
    }
}
