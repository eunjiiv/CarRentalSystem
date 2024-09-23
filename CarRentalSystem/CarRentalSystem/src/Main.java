// Main.java

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create a VIP client
        VIPClient vipClient = new VIPClient("C001", "Malakas Ben", "malakas.ben@example.com");

        // Create a car
        Car car = new Car("V001", "Toyota", "Corolla", "ABC123", "Petrol", 4);

        // Suggestion engine recommends a vehicle based on client preferences
        SuggestionEngine suggestionEngine = new SuggestionEngine();
        Vehicle suggestedVehicle = suggestionEngine.recommendVehicle(vipClient);
        System.out.println("Suggested Vehicle: " + suggestedVehicle.getModel());

        // Create a rental with Eco Mode enabled
        Rental ecoRental = new Rental("R002", car, vipClient, new Date(), new Date(), true);
        ecoRental.generateInvoice();
        ecoRental.generateEcoReport();

        // Process payment
        Payment payment = new CreditCardPayment("P001", ecoRental.applyDynamicPricing());
        payment.processPayment();

        // Loyalty program: accumulate points and check tier
        vipClient.accumulateLoyaltyPoints(ecoRental.applyDynamicPricing());
        System.out.println("Client's Loyalty Tier: " + vipClient.getLoyaltyTier());

        // IoT health monitoring
        VehicleHealthMonitor monitor = new VehicleHealthMonitor(car);
        monitor.checkVehicleHealth();
        monitor.sendRealTimeAlert("Low tire pressure");
    }
}
