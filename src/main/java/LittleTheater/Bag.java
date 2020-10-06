package LittleTheater;

public class Bag {

    private Ticket ticket;
    private Invitation invitation;
    private Card card;
    private Cash cash;

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

    public void setCard(Pay pay) {
        this.card = pay;
    }

    public void setCash(Pay pay) {
        this.cash = cash;
    }
}
