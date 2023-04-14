package org.example.strukturalne.dekorator;

public class DedlineBonus extends Bonus{

    public DedlineBonus(Payable payable) {
        super(payable);
    }

    @Override
    protected int getPaidBonus(int salary) {
        return (int) (salary*0.1F);
    }
}
