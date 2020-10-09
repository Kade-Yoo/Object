package litte_theater.customer.stuff;


import litte_theater.deal.means.Money;
import litte_theater.deal.means.MoneyFactory;
import litte_theater.deal.means.impl.Card;
import litte_theater.deal.means.impl.Cash;
import litte_theater.deal.thing.Invitation;
import litte_theater.deal.thing.Ticket;

public class Bag {

    private Ticket ticket;
    private Invitation invitation;
    private Money money;

    public Bag(Ticket ticket, Invitation invitation) {
        this.ticket = ticket;
        this.invitation = invitation;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void setInvitation(Invitation invitation) {
        this.invitation = invitation;
    }

    public Invitation getInvitation() {
        return invitation;
    }

    public Money getMoney() {return this.money;}

    // Factory Pattern적용 - 금액은 어떻게 셋팅해줄까?
    // Factory Method Pattern으로 심화 가능
    public void setMoneyType(int type) {
        MoneyFactory factory = new MoneyFactory(type);

        this.money = factory.getMoney();
    }
}
