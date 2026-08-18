package Homework19;
import java.util.*;
import java.util.stream.Collectors;

public class PhoneBookService {
    private List<Person> phoneBook;

    public PhoneBookService() {
        this.phoneBook = new ArrayList<>();
    }

    // Добавление тестовых данных
    public void addTestData() {
        phoneBook.add(new Person("Иван", "Ермак", "Москва", "89991234567",
                "ул. Ленина 10, Москва, 101000"));
        phoneBook.add(new Person("Полина", "Козлова", "Минск", "44123456789",
                "Независимости 25, Минск, 191186"));
        phoneBook.add(new Person("Герман", "Сидоров", "Иркутск", "89139826343",
                "Красный пр-т, 630099"));
        phoneBook.add(new Person("Валентина", "Козлова", "Екатеринбург", "89221112233",
                "ул. Малышева 15, 620014"));
        phoneBook.add(new Person("Полина", "Новикова", "Минск", "875554433",
                "ул. Казлова 20, 420111"));
        phoneBook.add(new Person("Полина", "Морозова", "Москва", "890377899",
                "аика укукиу"));
    }

    public List<Person> filterByFirstName(String firstName) {
        return phoneBook.stream()
                .filter(p -> p.getFirstName().equals(firstName))
                .collect(Collectors.toList());
    }
    public List<Person> filterByLastName(String lastName) {
        return phoneBook.stream()
                .filter(p -> p.getLastName().equals(lastName))
                .collect(Collectors.toList());
    }
   public List<Person> sortByLastName() {
        return phoneBook.stream()
                .sorted(Comparator.comparing(Person::getLastName))
                .collect(Collectors.toList());
    }
    public List<String> getAllAddresses() {
        return phoneBook.stream().map(Person::getAddress).collect(Collectors.toList());
    }

    public Map<String, Object> analyzeAddresses() {
        List<Person> valid = new ArrayList<>();
        List<Person> invalid = new ArrayList<>();

        for (Person p : phoneBook) {
            if (isValidAddress(p.getAddress())) {
                valid.add(p);
            } else {
                invalid.add(p);
            }
        }

        Map<String, Object> result = new HashMap<>();
        result.put("valid", valid);
        result.put("invalid", invalid);
        return result;
    }
    private boolean isValidAddress(String address) {
        if (address == null || address.isEmpty()) return false;

        boolean hasStreet = address.contains("ул.") ||
                address.contains("пр-т") ||
                address.contains("Невский") ||
                address.contains("улица") ||
                address.contains("проспект");

        boolean hasNumber = address.chars().anyMatch(Character::isDigit);

        return hasStreet && hasNumber;
    }
    public List<Person> getAll() {
        return new ArrayList<>(phoneBook);
    }
    public void addPerson(Person person) {
        phoneBook.add(person);
    }
}