package org.example.strukturalne.dekorator;

public class FreqBonus extends Bonus{
    public FreqBonus(Payable payable) {
        super(payable);
    }

    @Override
    protected int getPaidBonus(int salary) {
        return 100;
    }
}
