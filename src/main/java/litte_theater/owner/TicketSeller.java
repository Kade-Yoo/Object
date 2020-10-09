package litte_theater.owner;

import litte_theater.deal.means.Money;
import litte_theater.deal.thing.Invitation;
import litte_theater.deal.thing.Ticket;

public class TicketSeller {

    private TicketOffice office;

    public TicketSeller(TicketOffice office) {
        this.office = office;
    }

    public void sellTicket() {
    }

    // 관권을 티켓으로 교환
    public Ticket exchange(Invitation invitation) {
        // 티켓 재고 확인 후 교환
        if (office.countTicket() == 0) {
            // 종료 티켓 판매 완료됨
            return null;
        } else {
            return office.getTicket();
        }
    }

    // 티켓 판매(거스름돈 주는 로직 필요)
    public Ticket sellTicket(Money money) {
        // 돈을 받다

        // 티켓 제공
        return this.office.getTicket();
    }
}
