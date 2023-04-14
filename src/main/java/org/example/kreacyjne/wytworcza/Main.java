package org.example.kreacyjne.wytworcza;

import org.example.kreacyjne.budowniczy.Home;
import org.example.kreacyjne.wytworcza.models.FamiliHaus;

public class Main {
    public static void main(String[] args)  {

        Home dom = new Home.Builder().
                setWindowsNumber(10).
                setNumberFloors(2).
                setDoorNumber(23).
                build();

        //Statyczne metody wytworcze
        //from,valuOf,of,instansOF
        boolean isTrue = true;
        Boolean.valueOf(isTrue);

        FamiliHaus familiHaus=FamiliHaus.from(dom);


    }

}
