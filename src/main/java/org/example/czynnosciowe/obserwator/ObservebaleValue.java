package org.example.czynnosciowe.obserwator;

import java.util.Observable;

public class ObservebaleValue extends Observable {


    private int oldTemp=0;
    public void setValue(int newTemp) {
        if(newTemp!=oldTemp) {
            super.setChanged();
            super.notifyObservers(newTemp);
            oldTemp=newTemp;
        }
    }
    public int getOldTemp() {
        return oldTemp;
    }
}
