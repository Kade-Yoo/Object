package litte_theater.owner;

import litte_theater.deal.means.Money;
import litte_theater.deal.thing.Invitation;
import litte_theater.deal.thing.Ticket;

import java.util.List;

public class TicketOffice {

    private List<Ticket> tickets;
    private List<Invitation> invitations;
    private Money money;

    public Ticket getTicket() { return this.tickets.get(0); }

    // 티켓 재고 -1
    public void minusTicket() {
        tickets.remove(this.tickets.size() - 1);
    }

    // 티켓 재고량
    public int countTicket() {
        return this.tickets.size();
    }
    public int countInvitation() { return this.invitations.size(); }
    public int getMoneyAmount() { return this.money.getAmount(); }
}
