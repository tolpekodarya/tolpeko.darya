package Homework3;

import java.util.Scanner;

public class homework3 {
    public static void main(){
        System.out.println("Number 1:");
        checkParity();
        System.out.println("Number 2:");
        showTemp();
        System.out.println("Number 3:");
        calculatingSquare();
        System.out.println("Number 4:");
        increaseSeven();
        System.out.println("Number 5:");
        sumDigit();
    }

    public static void checkParity(){
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();

        if (n % 2 == 0){
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }

    public static void showTemp(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("t = ");
        int t = scanner.nextInt();

        if (t > -5){
            System.out.println("Warm");
        } else if (t > -20 && t <= -5) {
            System.out.println("Normal");
        } else if (t <= -20){
            System.out.println("Cold");
        }
    }

    public static void calculatingSquare(){
        for(int i = 10; i<20; i++ ){
            System.out.println(i*i);
        }
    }

    public static void increaseSeven(){
        int i = 7;
        while (i <= 98) {
            System.out.println(i);
            i += 7;}
    }

    public static void sumDigit(){
        int maxValue;

        do {
            System.out.print("Enter max value:");
            Scanner scanner = new Scanner(System.in);
            maxValue= scanner.nextInt();

        }while(maxValue<=1);

        int sum = 0;
        for (int counter=1;counter<=maxValue;counter++){
            sum+=counter;
        }
        int result = sum;
        System.out.println("Result: " + result);


    }
}
