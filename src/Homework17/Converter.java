package Homework17;
import java.util.function.Function;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        double exchangeRate = 2.9;

        Function<String, Double> bynToUsd = (input) -> {
            try {
                String numberStr = input.replace(" BYN", "").trim();
                double bynAmount = Double.parseDouble(numberStr);
                return bynAmount / exchangeRate;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка!");
                return null;
            }
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в BYN: ");
        String input = scanner.nextLine();

        Double usdAmount = bynToUsd.apply(input);
        if (usdAmount != null) {
            System.out.printf("Сумма в USD: %.2f USD%n", usdAmount);
        }
    }
}