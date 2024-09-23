// Rental.java

import java.util.Date;

public class Rental {
    private String rentalID;
    private Vehicle vehicle;
    private Client client;
    private Date rentalStartDate;
    private Date rentalEndDate;
    private double price;
    private boolean ecoMode;

    public Rental(String rentalID, Vehicle vehicle, Client client, Date rentalStartDate, Date rentalEndDate, boolean ecoMode) {
        this.rentalID = rentalID;
        this.vehicle = vehicle;
        this.client = client;
        this.rentalStartDate = rentalStartDate;
        this.rentalEndDate = rentalEndDate;
        this.ecoMode = ecoMode;
        this.price = applyDynamicPricing();
    }

    public double applyDynamicPricing() {
        double basePrice = 100;
        double discount = client.getLoyaltyDiscount();
        double ecoDiscount = ecoMode ? 0.05 : 0.0;
        return basePrice - (basePrice * (discount + ecoDiscount));
    }

    public void generateInvoice() {
        System.out.println("Invoice generated for Rental ID: " + rentalID);
    }

    public void generateEcoReport() {
        if (ecoMode) {
            System.out.println("Eco-friendly rental: You have saved X kg of CO2 emissions!");
        }
    }
}
