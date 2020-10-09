package litte_theater.deal.means;

/**
 * 결제
 */
public interface Money {

    void pay(int amount);
    void setAmount(int amount);
    int getAmount();
}
