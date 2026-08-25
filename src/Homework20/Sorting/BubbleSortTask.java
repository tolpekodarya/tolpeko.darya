package Homework20.Sorting;
import java.util.Arrays;

public class BubbleSortTask implements Runnable {

    private final int[] originalArray;

    public BubbleSortTask(int[] originalArray) {
        this.originalArray = originalArray;
    }

    @Override
    public void run() {

        int[] array = Arrays.copyOf(originalArray, originalArray.length);
        String threadName = Thread.currentThread().getName();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        long endTime = System.currentTimeMillis();
        System.out.printf("[%s]: %s (%d мс)%n",
                threadName, Arrays.toString(array), (endTime - startTime));
    }
}