package org.example.czynnosciowe.strategia;

public class CarTravelStrategy implements TravelStrategy {
    @Override
    public void goToWork() {
        System.out.println("Going car");
    }
}
