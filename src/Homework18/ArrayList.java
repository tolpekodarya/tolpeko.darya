package Homework18;
import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>(Arrays.asList(
                              1, 1, 3, 4, 6, 6, 7, 8, 9, 8, 2, 4, 6, 8, 6, 3, 5, 9, 9, 1));
        System.out.println("Initial list: " + numbers);
        int sum = numbers.stream().distinct().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of elements without duplуcates: " + sum);
    }
}