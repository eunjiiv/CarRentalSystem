// VehicleHealthMonitor.java

public class VehicleHealthMonitor {
    private Vehicle vehicle;

    public VehicleHealthMonitor(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void checkVehicleHealth() {
        System.out.println("Checking vehicle health for: " + vehicle.getModel());
        System.out.println("Fuel level: 75%");
        System.out.println("Tire pressure: Normal");
        System.out.println("Engine status: Good");
    }

    public void sendRealTimeAlert(String issue) {
        System.out.println("ALERT: " + issue + " detected on vehicle: " + vehicle.getModel());
    }
}
