package Homework4;

import java.util.Scanner;

public class homework4 {
    public static void main(String [] args){
        iterateOverArray();
        findMaxMin();
        findIndex();
        getNull();
        replaceElements();
        checkArray();
    }

    public static void iterateOverArray() {
        System.out.println("Task 1:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++)  array[i] = (int)(Math.random() * 100);
        for(int i = 0; i <size; i++)  System.out.print(array[i] + " ");
        System.out.println();
        for (int i = size - 1; i >= 0; i--)  System.out.print(array[i] + " ");

        System.out.println();
        System.out.println("-".repeat(70));
    }
    public static void findMaxMin(){
        System.out.println("Task 2:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 100);}
        for(int i = 0; i <size; i++)  System.out.print(array[i] + " ");
        System.out.println();

        int max = array[0];
        int min = array[0];

        for(int i = 0; i < array.length; i++){

            if(array[i] > max){
                max = array[i];
            }
        }
        for(int i = 0; i < array.length; i++){

            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("Max element: " + max + " Minimal element: " + min);

        System.out.println("-".repeat(70));
    }
    public static void findIndex(){
        System.out.println("Task 3:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 100);}
        for(int i = 0; i <size; i++)  System.out.print(array[i] + " ");
        System.out.println();

        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;


        for(int i = 0; i < array.length; i++){

            if(array[i] > max){
                max = array[i];
                maxIndex = (i + 1);
            }

        }
        for(int i = 0; i < array.length; i++){

            if(array[i] < min){
                min = array[i];
                minIndex = (i + 1);
            }
        }

        System.out.println("Index maximum element: " + maxIndex + " Index minimal element: " + minIndex);

        System.out.println("-".repeat(70));

    }
    public static void getNull(){
        System.out.println("Task 4:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 100);}
        for(int i = 0; i <size; i++)  System.out.print(array[i] + " ");
        System.out.println();

        int nollElement = 0;
        for(int i = 0; i < array.length; i++){

            if(array[i] == nollElement){
                System.out.println("Find null element!!");
            } else System.out.println("Dont find null element!!");
        }
        System.out.println("-".repeat(70));
    }
    public static void replaceElements(){
        System.out.println("Task 5:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 100);}
        for(int i = 0; i <size; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        int left = 0;
        int right = size - 1;
        int x;
        while(left<right){
            x = array[left];
            array[left] = array[right];
            array[right] = x;

            right--;
            left++;

        }
        for(int i = 0; i < size; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        System.out.println("-".repeat(70));

    }
    public static void checkArray(){
        System.out.println("Task 6:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int)(Math.random() * 100);}
        for(int i = 0; i <size; i++)  System.out.print(array[i] + " ");
        System.out.println();

        boolean isIncreas = true;

        for (int i = 1; i < size; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreas = false;
                break;
            }
        }
        if(isIncreas ==true){
            System.out.println("Is ascending sequence");}else {
            System.out.println("Isn't ascending sequence");
        }
    }
}
