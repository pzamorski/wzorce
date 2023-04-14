package org.example.czynnosciowe.strategia;

import org.example.strukturalne.dekorator.Payable;

public class Employer implements TravelStrategy,JobStrategy,BrekfastStrategy, Payable {

    private int salary=0;

    public TravelStrategy travelStrategy;
    public JobStrategy jobResposibility;
    public BrekfastStrategy brekfast;

    @Override
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void eatYourBrekfast() {
        brekfast.eatYourBrekfast();
    }
    @Override
    public void doYourJob() {
        jobResposibility.doYourJob();
    }

    @Override
    public void goToWork() {
        travelStrategy.goToWork();
    }
}
