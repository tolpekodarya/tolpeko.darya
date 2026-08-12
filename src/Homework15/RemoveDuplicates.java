package Homework15;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        addElements();
    }

    public static void addElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String input = scanner.nextLine();

        String[] numbers = input.split("\\s+");
        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (String number : numbers) {
            set.add(number);
        }
        System.out.println("List without duplicates: " + set);
    }

}