package Homework20.Sorting;
import java.util.Arrays;

public class SelectionSortTask implements Runnable {

    private final int[] originalArray;

    public SelectionSortTask(int[] originalArray) {
        this.originalArray = originalArray;
    }

    @Override
    public void run() {

        int[] array = Arrays.copyOf(originalArray, originalArray.length);
        String threadName = Thread.currentThread().getName();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }

        long endTime = System.currentTimeMillis();
        System.out.printf("[%s] Отсортировано: %s (время: %d мс)%n",
                threadName, Arrays.toString(array), (endTime - startTime));
    }
}