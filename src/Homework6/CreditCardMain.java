package Homework6;

public class CreditCardMain {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("1234", 100.0);
        CreditCard card2 = new CreditCard("5678", 155.0);
        CreditCard card3 = new CreditCard("1122", 225.0);

        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();

        System.out.println("Operation:");

        card1.deposit(55.0);
        card2.deposit(31.0);
        card3.getMoney(11.0);
        System.out.println();
        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();
    }

    public static class CreditCard {
        private String number;
        private double balance;

        public CreditCard(String number, double cardsBalance) {
            this.number = number;
            this.balance = cardsBalance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Card " + number + " accrued: " + amount + "$");
        }

        public void getMoney(double amount) {
            if (amount > 0) {
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Cards " + number + " pull off: " + amount + "$");
                } else {
                    System.out.println("Insufficient funds on the card" + number);
                }
            }
        }

        public void displayInfo() {
            System.out.println("Card " + number + ", balance: " + balance + "$");
        }
    }
}