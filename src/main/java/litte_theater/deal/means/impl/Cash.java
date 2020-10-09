package litte_theater.deal.means.impl;

import litte_theater.deal.means.Money;

public class Cash implements Money {

    private int amount;

    @Override
    public void pay(int amount) {
        payCash(amount);
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int getAmount() {
        return this.amount;
    }

    private void payCash(int amount) {
        setAmount(amount);
    }
}
