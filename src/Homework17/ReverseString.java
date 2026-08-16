package Homework17;
import java.util.function.Supplier;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Supplier<String> reverseInput = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter string: ");
            String input = scanner.nextLine();

            StringBuilder reversed = new StringBuilder(input);
            return reversed.reverse().toString();
        };

        String result = reverseInput.get();
        System.out.println("Reversed string: " + result);

    }

    }
