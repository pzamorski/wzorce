package org.example.strukturalne.dekorator;

public class SpecialBonus extends Bonus{
    Payable payable;
    public SpecialBonus(Payable payable) {
        super(payable);
    }

    @Override
    protected int getPaidBonus(int salary) {
        return 1000;
    }
}
