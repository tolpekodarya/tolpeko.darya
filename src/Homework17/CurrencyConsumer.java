package Homework17;
import java.util.function.Consumer;
import java.util.Scanner;

public class CurrencyConsumer {
    public static void main(String[] args) {
        double exchangeRate = 2.9;
        Consumer<String> printUsd = (input) -> {
            try {
                String numberStr = input.replace(" BYN", "").trim();
                double bynAmount = Double.parseDouble(numberStr);
                double usdAmount = bynAmount / exchangeRate;
                System.out.printf("%s BYN = %.2f USD%n", input, usdAmount);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: неверный формат строки '" + input + "'");
            }
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в BYN: ");
        String input = scanner.nextLine();
        printUsd.accept(input);
    }
}