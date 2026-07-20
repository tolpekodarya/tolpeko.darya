package Homework11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 строки:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        String shorter = str1;
        String longer = str1;

        if (str2.length() < shorter.length()) shorter = str2;
        if (str3.length() < shorter.length()) shorter = str3;
        if (str2.length() > longer.length()) longer = str2;
        if (str3.length() > longer.length()) longer = str3;

        System.out.println("Shorter: \"" + shorter + "\"," + shorter.length());
        System.out.println("Longer: \"" + longer + "\"," + longer.length());

    }
}
