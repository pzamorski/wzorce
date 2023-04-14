package org.example.czynnosciowe.strategia;

public class BikeTravelStrategy implements TravelStrategy {
    @Override
    public void goToWork() {
        System.out.println("Going by bike");
    }
}
