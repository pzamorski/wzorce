package org.example.kreacyjne.budowniczy;

import org.example.kreacyjne.singleton.Loger;

public class Main {
    public static void main(String[] args)  {

        Home dom = new Home.Builder().
                setWindowsNumber(10).
                setNumberFloors(2).
                setDoorNumber(23).
                build();

        System.out.println(dom.toString());
    }

}
