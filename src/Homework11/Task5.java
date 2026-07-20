package Homework11;

import java.util.Scanner;

import java.util.Scanner;  // ← ДОБАВИТЬ!

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter word: ");
        String str1 = scanner.nextLine();

        System.out.println("The result: " + str1 + " -> " + duplicateLetters(str1));

    }

    public static String duplicateLetters(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            result.append(c).append(c);
        }

        return result.toString();
    }
}

