package Homework17;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BirthdayToCentury {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.print("Введите дату рождения: ");
        String input = scanner.nextLine();

        try {
            LocalDate birthDate = LocalDate.parse(input, formatter);
            LocalDate hundredthBirthday = birthDate.plusYears(100);

            System.out.println("Вам исполнится 100 лет: " + hundredthBirthday.format(formatter));
            System.out.println("Это будет " + hundredthBirthday.getDayOfWeek().getDisplayName(java.time.format.TextStyle.FULL, new java.util.Locale("ru")));
        } catch (Exception e) {
            System.out.println("Ошибка: неверный формат даты!");
        }
    }
}
