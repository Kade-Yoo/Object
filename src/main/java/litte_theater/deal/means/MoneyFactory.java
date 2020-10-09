package litte_theater.deal.means;

import litte_theater.deal.means.impl.Card;
import litte_theater.deal.means.impl.Cash;

public class MoneyFactory {

    private Money money;

    public MoneyFactory(int moneyType) {
        if (moneyType == 1) {
            this.money = new Cash();
        } else if (moneyType == 2) {
            this.money = new Card();
        }
    }

    public Money getMoney() {
        return this.money;
    }
}
