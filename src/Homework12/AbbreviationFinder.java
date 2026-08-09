package Homework12;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class AbbreviationFinder {
        public static void main(String[] args) {
            String userString = getUserInput();
            String result = findAbbreviations(userString);
            printResult(result);
        }

        private static String getUserInput() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String userString = scanner.nextLine();
            return userString;
        }
        private static String findAbbreviations(String text) {
            Pattern pattern = Pattern.compile("\\b[A-Z]{2,6}\\b");
            Matcher matcher = pattern.matcher(text);

            StringBuilder result = new StringBuilder();
            boolean find = false;

            while (matcher.find()) {
                result.append(matcher.group()).append("\n");
                find = true;
            }
            if (!find) {
                result.append("(no)");
            }
            return result.toString();
        }
        private static void printResult(String result) {
            System.out.println("Abbreviations: ");
            System.out.print(result);
        }
    }

