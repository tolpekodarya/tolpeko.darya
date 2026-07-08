package Homework6.atm;

public class ATM {
    private int count20;
    private int count50;
    private int count100;


    public ATM(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
        System.out.println("Current balance: " + getTotalBalance() + "$");
    }
    public static void main(String[] args) {
        ATM atm = new ATM(10, 10, 10); // Инициализируем банкомат

        atm.addMoney(5, 2, 1); // Пополняем банкомат

        // Проверяем снятие
        boolean isSuccess = atm.withdrawMoney(240);
        System.out.println("Operation result: " + isSuccess);
    }
    private int getTotalBalance() {
        return (count20 * 100) + (count50 * 50) + (count100 * 10);
    }
    public void addMoney(int add20, int add50, int add100) {
        this.count20 += add20;
        this.count50 += add50;
        this.count100 += add100;
        System.out.println("Cash have been added.");
        System.out.println("New balance " + getTotalBalance() + "$");
    }
    public boolean withdrawMoney(int amount) {
        System.out.println("Amount requested for withdrawal: " + amount + "$");

        if (amount % 20 != 0) {
            System.out.println("Error: the amount must be a multiple of 20$.");
            return false;
        }

        int need100 = amount / 100;
        int take100 = Math.min(need100, count100);
        amount -= take100 * 100;

        int need50 = amount / 50;
        int take50 = Math.min(need50, count50);
        amount -= take50 * 50;

        int need20 = amount / 20;
        int take20 = Math.min(need20, count20);
        amount -= take20 * 20;

        if (amount != 0) {
            System.out.println("Operation impossible: insufficient banknotes of the required denomination.");
            return false;
        }

        this.count100 -= take100;
        this.count50 -= take50;
        this.count20 -= take20;

        System.out.println("Cash successfully issued:");
        if (take100 > 0) System.out.println("Banknotes with a face value of 100: " + take100 );
        if (take50 > 0) System.out.println("Banknotes with a face value of 50: " + take50 );
        if (take20 > 0) System.out.println("Banknotes with a face value of 20: " + take20 );
        return true;
    }


}