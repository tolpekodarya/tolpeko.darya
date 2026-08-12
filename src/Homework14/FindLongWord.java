package Homework14;

import java.io.*;
import java.nio.file.*;
import java.util.regex.*;

public class FindLongWord {
    public static void main(String[] args) {
        String inputFile = "src/Homework14/romeo_and_juliet.txt";
        String outputFile = "src/Homework14/longest_word.txt";

        try {
            String text = new String(Files.readAllBytes(Paths.get(inputFile)), "UTF-8");
            Pattern pattern = Pattern.compile("[A-Za-z']+");
            Matcher matcher = pattern.matcher(text);

            String longestWord = "";
            int maxLength = 0;

            while (matcher.find()) {
                String word = matcher.group();
                if (word.length() > maxLength) {
                    maxLength = word.length();
                    longestWord = word;
                }
            }

            Files.write(Paths.get(outputFile), longestWord.getBytes("UTF-8"));

            System.out.println("The most long word -> " + longestWord);
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
            System.err.println("Убедитесь, что файл " + inputFile + " существует в текущей папке.");
        }
    }
}
