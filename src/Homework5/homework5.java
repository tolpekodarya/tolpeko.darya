package Homework5;

import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        calculate();
        drawChessboard();
    }

    public static void calculate() {
        int[][] matrix = new int[3][4];


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        // Добавляем число к КАЖДОМУ элементу
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] += number;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Summation result: " + sum);


    }

    public static void drawChessboard() {
        String[][] board = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if ((i + j) % 2 == 0) {
                    board[i][j] = "W";
                } else {
                    board[i][j] = "B";

                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }
}

