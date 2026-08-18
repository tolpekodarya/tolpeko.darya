package Homework19;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneBookService service = new PhoneBookService();
        service.addTestData();


        System.out.println( "Фильтр по имени");
        List<Person> byName = service.filterByFirstName("Полина");
        printList(byName);

        System.out.println("--".repeat(50));
        System.out.println("Фильтр по фамилии ");
        List<Person> byLastName = service.filterByLastName("Козлова");
        printList(byLastName);

        System.out.println("--".repeat(50));

        System.out.println("Сортировка по фамилии");
        List<Person> sorted = service.sortByLastName();
        printList(sorted);

        System.out.println("--".repeat(50));

        System.out.println("Все почтовые адреса");
        List<String> addresses = service.getAllAddresses();
        for (int i = 0; i < addresses.size(); i++) {
            System.out.println((i + 1) + ". " + addresses.get(i));
        }
        System.out.println("--".repeat(50));

        analyzeAndPrint(service);

        System.out.println("--".repeat(50));

        System.out.println("Вся телефонная книга");
        printList(service.getAll());
    }

    private static void printList(List<Person> list) {
        if (list.isEmpty()) {
            System.out.println("Нет записей");
            return;
        }
        for (Person p : list) {
            System.out.println(p);
        }
    }

    @SuppressWarnings("unchecked")
    private static void analyzeAndPrint(PhoneBookService service) {
        Map<String, Object> result = service.analyzeAddresses();

        List<Person> valid = (List<Person>) result.get("valid");
        List<Person> invalid = (List<Person>) result.get("invalid");


        System.out.println("Корректные адреса:");
        for (Person p : valid) {
            System.out.println("  " + p.getFirstName() + " " + p.getLastName() + ": " + p.getAddress());
        }
        System.out.println("Некорректные адреса:");
        for (Person p : invalid) {
            System.out.println("  " + p.getFirstName() + " " + p.getLastName() + ": " + p.getAddress());
        }
    }
}