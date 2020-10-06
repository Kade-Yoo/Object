package LittleTheater;

import java.util.List;

public class TicketOffice {

    private List<Ticket> ticket;

    // 관람권을 티켓으로 변환
    public int exchange(Invitation invitation) {
        // 관람권 확인

        // 티켓 전달
        if (ticket.isEmpty()) {
            // 종료 티켓 판매 완료됨
            return 0;
        } else {
            minusTicket();
            return countTicket();
        }
    }

    // 티켓 재고 -1
    public void minusTicket() {
        ticket.remove(this.ticket.size() - 1);
    }

    // 티켓 재고량
    public int countTicket() {
        return this.ticket.size();
    }
}
