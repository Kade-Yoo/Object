package LittleTheater;

/**
 * 결제
 */
public class Pay implements Card, Cash{

    private int money;

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
