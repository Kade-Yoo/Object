package litte_theater.customer;

import litte_theater.customer.stuff.Bag;
import litte_theater.deal.means.Money;
import litte_theater.deal.means.MoneyFactory;
import litte_theater.deal.thing.Ticket;

public class Audience {

    private Bag bag;
    private Money money;

    // 가방을 갖고 있을 때
    public Audience(Bag bag) {
        this.bag = bag;
    }

    // 가방을 갖고있지 않을 때
    public Audience(Bag bag, Money money) {
        this.bag = bag;
        this.money = money;
    }

    public Money buyTicket(Ticket ticket) {
        // 현금 or 카드 구분해줘야함
        MoneyFactory moneyFactory = new MoneyFactory(1);

        // 가방 유무 확인 후 티켓 저장
        if (hasBag()) {
            // 가방안에 있는 돈은 어떤 타입일까? 결정은 어떻게 하지?
            money = this.bag.getMoney();
            this.bag.setTicket(ticket);
        } else {
            this.money = moneyFactory.getMoney();
        }

        return money;
    }

    private boolean hasBag() {
        if (this.bag == null) {
            return false;
        }
        return true;
    }

    public void seePlay() {
        // 극장을 가다

        // 연극을 보다
    }

    public Bag getBag() {
        return this.bag;
    }

    public Money getMoney() { return money; }
}
