package org.example.kreacyjne.singleton;

public class Loger {
    private static Loger instace;

    private Loger( ) {}

    public static Loger getInstace(){
        return SingetonHolder.INSTACE;
    }
    public void logToConsole(String arq){
        System.out.println(arq);
    }

    private static class SingetonHolder{
        private static final Loger INSTACE=new Loger();
    }
}
