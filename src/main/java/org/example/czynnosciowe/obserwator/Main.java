package org.example.czynnosciowe.obserwator;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ObservebaleValue observableValue = new ObservebaleValue();

        observableValue.addObserver((o, arg) -> System.out.println(arg));


        while (true){
            TimeUnit.SECONDS.sleep(1);
            observableValue.setValue((int) (Math.random()*10+2));
        }

    }

}
