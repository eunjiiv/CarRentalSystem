// Car.java

public class Car extends Vehicle {
    private String fuelType;
    private int numberOfSeats;

    public Car(String vehicleID, String brand, String model, String licensePlate, String fuelType, int numberOfSeats) {
        super(vehicleID, "Car", brand, model, licensePlate);
        this.fuelType = fuelType;
        this.numberOfSeats = numberOfSeats;
    }
}
