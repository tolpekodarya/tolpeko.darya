package Homework12;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InfoFinder {

    public static void main(String[] args) {
        String userStr = getUserStr();
        findAndPrintDocInfo(userStr);
    }
    private static String getUserStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String userStr = scanner.nextLine();
        return userStr;
    }

    private static void findAndPrintDocInfo(String text) {
        String email = findEmail(text);

        String documentNumber = findDocumentNumber(text);

        String phoneNumber = findPhoneNumber(text);

        printResults(email, documentNumber, phoneNumber);
    }

    private static String findEmail(String text) {
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private static String findDocumentNumber(String text) {
        Pattern pattern = Pattern.compile("\\b\\d{4}-\\d{4}-\\d{2}\\b");
        Matcher matcher = pattern.matcher(text);

        StringBuilder result = new StringBuilder();
        boolean found = false;

        while (matcher.find()) {
            if (found) {
                result.append(", ");
            }
            result.append(matcher.group());
            found = true;
        }

        return found ? result.toString() : null;
    }

    private static String findPhoneNumber(String text) {
        Pattern pattern = Pattern.compile("\\+\\d{2}\\)\\d{7}");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private static void printResults(String email, String documentNumber, String phoneNumber) {
        System.out.println();
        System.out.println("--".repeat(50));
        if (email != null) {
            System.out.println("email: " + email);
        }
        if (documentNumber != null) {
            System.out.println("document number: " + documentNumber);
        }
        if (phoneNumber != null) {
            System.out.println("phone number: " + phoneNumber);
        }
        if (email == null && documentNumber == null && phoneNumber == null) {
            System.out.println("The information isnt found in a text!");
        }
    }
}
