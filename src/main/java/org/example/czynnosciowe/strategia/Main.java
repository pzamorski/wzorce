package org.example.czynnosciowe.strategia;



public class Main {
    public static void main(String[] args) throws InterruptedException {






        Employer mike = new Employer();
        mike.setSalary(10000);
        mike.travelStrategy=new BikeTravelStrategy();
        mike.jobResposibility=new DoctorJobStrategy();
        mike.brekfast=new SandwitchBrekfastStrategy();
        mike.goToWork();
        mike.doYourJob();
        mike.eatYourBrekfast();
        mike.travelStrategy=new CarTravelStrategy();
        mike.goToWork();




    }
}