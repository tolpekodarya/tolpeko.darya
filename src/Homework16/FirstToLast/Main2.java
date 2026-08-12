package Homework16.FirstToLast;
import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        String[] test1 = {"fruits", "Apples", "Bananas"};
        System.out.println("Test 1: " + FirstToLast.pairs(test1));
        System.out.println("=".repeat(50));



        String[] test2 = {"carrot", "cat", "car"};
        System.out.println("Test 2: " + FirstToLast.pairs(test2));
        System.out.println("=".repeat(50));



        String[] test3 = {"abcd", "abc", "ab", "a"};
        System.out.println("Test 3: " + FirstToLast.pairs(test3));
        System.out.println("=".repeat(50));



        String[] test4 = {"welcom", "to", "my", "Java", "code"};
        System.out.println("Test 4: " + FirstToLast.pairs(test4));
        System.out.println("=".repeat(50));



        String[] test5 = {"q", "w", "e"};
        System.out.println("Test 5: " + FirstToLast.pairs(test5));
        System.out.println("=".repeat(50));


    }
}
