package org.example.strukturalne.dekorator;

import org.example.czynnosciowe.strategia.*;

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


        System.out.println("Zzaronki: "+mike.getSalary());
        System.out.println("Zzarobki: "+ new FreqBonus(new DedlineBonus(new SpecialBonus(mike))).getSalary());

        Payable employer=mike;

        if (mike.getSalary()>8000){
            employer=new SpecialBonus(mike);
        }
        if(mike.travelStrategy instanceof BikeTravelStrategy){
            employer=new FreqBonus(employer);
        }




    }
}