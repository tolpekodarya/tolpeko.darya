package Homework16.WordMultipleMap;

public class Main1 {
    public static void main(String[] args) {

        String[] test1 = {"a", "b", "a", "c", "b"};
        System.out.println("Test 1: " + WordMultiple.wordMultiple(test1));

        System.out.println("=".repeat(50));

        String[] test2 = {"a", "b", "c"};
        System.out.println("Test 2: " + WordMultiple.wordMultiple(test2));

        System.out.println("=".repeat(50));

        String[] test3 = {"a", "b", "a", "a", "b"};
        System.out.println("Test 3: " + WordMultiple.wordMultiple(test3));

        System.out.println("=".repeat(50));
        String[] test4 = {};
        System.out.println("Test 4: " + WordMultiple.wordMultiple(test4));

        System.out.println("=".repeat(50));
        String[] test5 = {"x"};
        System.out.println("Test 5: " + WordMultiple.wordMultiple(test5));

    }
}