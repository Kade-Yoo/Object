package litte_theater.deal.means.impl;

import litte_theater.deal.means.Money;

public class Card implements Money {

    private int amount;

    @Override
    public void pay(int money) {
        payOfCash(money);
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int getAmount() {
        return this.amount;
    }

    private void payOfCash(int amount) {
        setAmount(amount);
    }
}
