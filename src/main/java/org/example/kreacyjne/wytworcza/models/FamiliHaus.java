package org.example.kreacyjne.wytworcza.models;

import org.example.kreacyjne.budowniczy.Home;

public class FamiliHaus {
    private final int doorNumber;
    private final int windowsNumber;

    public FamiliHaus(int doorNumber, int windowsNumber) {
        this.doorNumber = doorNumber;
        this.windowsNumber = windowsNumber;
    }

    public static FamiliHaus from(Home dom) {
        return new FamiliHaus(dom.getDoorNumber(),dom.getWindowsNumber());
    }
}
