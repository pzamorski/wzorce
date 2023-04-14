package org.example.strukturalne.adapter;

import org.example.czynnosciowe.strategia.Employer;

public class officialTripingEpmoyer {
    private Employer employer;

    public officialTripingEpmoyer(Employer employer) {

        this.employer = employer;
    }

    public void goToClient() {
        employer.goToWork();
        System.out.println(" to client");
    }
}
