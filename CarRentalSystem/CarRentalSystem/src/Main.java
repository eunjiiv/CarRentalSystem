

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        VIPClient vipClient = new VIPClient("C001", "Malakas Ben", "malakas.ben@example.com");


        Car car = new Car("V001", "Toyota", "Corolla", "ABC123", "Petrol", 4);

        
        SuggestionEngine suggestionEngine = new SuggestionEngine();
        Vehicle suggestedVehicle = suggestionEngine.recommendVehicle(vipClient);
        System.out.println("Suggested Vehicle: " + suggestedVehicle.getModel());

        
        Rental ecoRental = new Rental("R002", car, vipClient, new Date(), new Date(), true);
        ecoRental.generateInvoice();
        ecoRental.generateEcoReport();

    
        Payment payment = new CreditCardPayment("P001", ecoRental.applyDynamicPricing());
        payment.processPayment();

        
        vipClient.accumulateLoyaltyPoints(ecoRental.applyDynamicPricing());
        System.out.println("Client's Loyalty Tier: " + vipClient.getLoyaltyTier());

        
        VehicleHealthMonitor monitor = new VehicleHealthMonitor(car);
        monitor.checkVehicleHealth();
        monitor.sendRealTimeAlert("Low tire pressure");
    }
}
