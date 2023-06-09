package org.example.strukturalne.dekorator;

public abstract class Bonus implements Payable{
    private final Payable payable;

    public Bonus(Payable payable) {
        this.payable = payable;
    }

    @Override
    public int getSalary() {
        return payable.getSalary()+getPaidBonus(payable.getSalary());
    }

    abstract protected int getPaidBonus(int salary);
}
