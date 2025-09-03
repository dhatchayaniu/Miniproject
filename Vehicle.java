package miniproject;

public abstract class Vehicle {
    protected String vehicleId;
    protected String brand;
    protected double rentPerDay;
    protected boolean isAvailable;

    public Vehicle(String vehicleId, String brand, double rentPerDay) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.rentPerDay = rentPerDay;
        this.isAvailable = true;
    }

    public abstract String getType();

    public double calculateRent(int days) {
        return rentPerDay * days;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean status) {
        this.isAvailable = status;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public void displayDetails() {
        System.out.println(getType() + " | ID: " + vehicleId + " | Brand: " + brand + " | ₹" + rentPerDay + "/day | Available: " + isAvailable);
    }
}
