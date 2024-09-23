// Vehicle.java

public class Vehicle {
    private String vehicleID;
    private String type;
    private String brand;
    private String model;
    private String licensePlate;
    private boolean availabilityStatus;
    private String location;
    private boolean maintenanceStatus;

    public Vehicle(String vehicleID, String type, String brand, String model, String licensePlate) {
        this.vehicleID = vehicleID;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.availabilityStatus = true;
        this.maintenanceStatus = false;
    }

    public String trackLocation() {
        return location;
    }

    public void updateMaintenanceStatus(boolean status) {
        this.maintenanceStatus = status;
    }

    public boolean isAvailable() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean status) {
        this.availabilityStatus = status;
    }

    public String getModel() {
        return model;
    }
}
