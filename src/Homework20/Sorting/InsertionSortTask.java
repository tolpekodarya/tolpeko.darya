package Homework20.Sorting;
import java.util.Arrays;

public class InsertionSortTask implements Runnable {

    private final int[] originalArray;

    public InsertionSortTask(int[] originalArray) {
        this.originalArray = originalArray;
    }

    @Override
    public void run() {
        // Создаем копию массива для сортировки
        int[] array = Arrays.copyOf(originalArray, originalArray.length);
        String threadName = Thread.currentThread().getName();
        long startTime = System.currentTimeMillis();

        // Сортировка вставками
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

        long endTime = System.currentTimeMillis();
        System.out.printf("[%s] Отсортировано: %s (время: %d мс)%n",
                threadName, Arrays.toString(array), (endTime - startTime));
    }
}
