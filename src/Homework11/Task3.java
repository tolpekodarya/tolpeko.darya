package Homework11;

import java.util.Scanner;

public class Task3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter 3 str:");
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            String str3 = scanner.nextLine();

            double average = (str1.length() + str2.length() + str3.length()) / 3.0;

            System.out.println("Average length: " + average);
            System.out.println("Strings with a length less than the average:");

            if (str1.length() < average) {
                System.out.println("\"" + str1 + "\" (length: " + str1.length() + ")");
            }
            if (str2.length() < average) {
                System.out.println("\"" + str2 + "\" (length: " + str2.length() + ")");
            }
            if (str3.length() < average) {
                System.out.println("\"" + str3 + "\" (length: " + str3.length() + ")");
            }
        }
    }
