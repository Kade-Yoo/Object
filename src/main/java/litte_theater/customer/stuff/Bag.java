package litte_theater.customer.stuff;


import litte_theater.deal.means.Pay;
import litte_theater.deal.means.impl.Card;
import litte_theater.deal.means.impl.Cash;
import litte_theater.deal.thing.Invitation;
import litte_theater.deal.thing.Ticket;

public class Bag {

    private final Ticket ticket;
    private Invitation invitation;
    private Pay pay;

    public Bag(Ticket ticket, Invitation invitation) {
        this.ticket = ticket;
        this.invitation = invitation;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public Invitation getInvitation() {
        return invitation;
    }

    public void setCard(Card card) {
        this.pay = card;
    }

    public void setCash(Cash cash) {
        this.pay = cash;
    }
}
