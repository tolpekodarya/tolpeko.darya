package Homework11;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 str:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        String allText = str1 + " " + str2 + " " + str3;
        String[] words = allText.split("\\s+");

        String result = null;

        for (String word : words) {
            if (hasAllUniqueChars(word)) {
                result = word;
                break;
            }
        }

        if (result != null) {
            System.out.println("The first word with unique characters: \"" + result + "\"");
        } else {
            System.out.println("No words with unique characters found.");
        }

    }

    public static boolean hasAllUniqueChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
