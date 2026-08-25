package Homework20.Sorting;
import java.util.Arrays;
import java.util.Random;

public class Main {

    private static final int[] ORIGINAL_ARRAY = generateRandomArray(10);

    public static void main(String[] args) {
        System.out.println("Исходный массив: " + Arrays.toString(ORIGINAL_ARRAY));
        System.out.println("-".repeat(100));

        Thread insertionThread = new Thread(new InsertionSortTask(ORIGINAL_ARRAY), "InsertionSort");
        Thread selectionThread = new Thread(new SelectionSortTask(ORIGINAL_ARRAY), "SelectionSort");
        Thread bubbleThread = new Thread(new BubbleSortTask(ORIGINAL_ARRAY), "BubbleSort");

        insertionThread.start();
        selectionThread.start();
        bubbleThread.start();

        try {
            insertionThread.join();
            selectionThread.join();
            selectionThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // числа от 0 до 99
        }
        return array;
    }
}