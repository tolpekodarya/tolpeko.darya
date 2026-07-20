package Homework11;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 3 str:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        String[] strings = {str1, str2, str3};

        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - 1 - i; j++) {
                if (strings[j].length() > strings[j + 1].length()) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }

        System.out.println("Strings in order of increasing length:");
        for (String s : strings) {
            System.out.println("\"" + s + "\" (length: " + s.length() + ")");
        }

    }
}