package Homework17;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PositiveNumbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(-1, 0, 2, -4, -6,-54, 45, 32,35, 2,-5673423);

        Predicate<Integer> isPositive = num -> num > 0;

        System.out.println("Исходный массив: " + numbers);

        List<Integer> positiveNumbers = numbers.stream().filter(isPositive).toList();

        System.out.println("Положительные числа: " + positiveNumbers);

    }
}