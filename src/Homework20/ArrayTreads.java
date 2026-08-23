package Homework20;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTreads {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Исходный массив: " + Arrays.toString(array));
        ResultHolder maxResult = new ResultHolder();
        ResultHolder minResult = new ResultHolder();

        MaxRunnable maxRunnable = new MaxRunnable(array, maxResult);
        MinRunnable minRunnable = new MinRunnable(array, minResult);

        Thread maxThread = new Thread(maxRunnable);
        Thread minThread = new Thread(minRunnable);

        maxThread.start();
        minThread.start();

        maxThread.join();
        minThread.join();

        System.out.println("Максимум: " + maxResult.getValue());
        System.out.println("Минимум: " + minResult.getValue());
    }
}


class ResultHolder {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class MaxRunnable implements Runnable {
    private final int[] array;
    private final ResultHolder result;

    public MaxRunnable(int[] array, ResultHolder result) {
        this.array = array;
        this.result = result;
    }

    @Override
    public void run() {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        result.setValue(max);
    }
}

class MinRunnable implements Runnable {
    private final int[] array;
    private final ResultHolder result;

    public MinRunnable(int[] array, ResultHolder result) {
        this.array = array;
        this.result = result;
    }

    @Override
    public void run() {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        result.setValue(min);
    }
}