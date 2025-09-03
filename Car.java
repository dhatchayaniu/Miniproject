public class Car extends Vehicle {
    public Car(String vehicleId, String brand, double rentPerDay) {
        super(vehicleId, brand, rentPerDay);
    }

    @Override
    public String getType() {
        return "Car";
    }
}
