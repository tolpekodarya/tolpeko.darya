package Homewok1;

import java.util.Scanner;

public class homework1 {
        public static void main(String[] args ) {
            System.out.println("Number 1:");
            useFormula();
            System.out.println("Number 2:");
            canculatDigits();
            System.out.println("Number 3:");
            canculatDigits2();
            System.out.println("Number 4:");
            roundDigits();
            System.out.println("Number 5:");
            findRest();
            System.out.println("Number 6:");
            changePlace();
        }

        public static void useFormula() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("b = ");
            double b = scanner.nextDouble();
            System.out.print("c = ");
            double c = scanner.nextDouble();
            double a = 4 * (b + c - 1) / 2;
            System.out.println("a = " + a);

        }

        public static void canculatDigits() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("n = ");
            int n = scanner.nextInt();
            int x = n / 10;
            int y = n % 10;
            int res2 = x + y;
            System.out.println("res = " + res2);
        }

        public static void canculatDigits2() {

            Scanner scanner = new Scanner(System.in);
            System.out.print("n = ");
            int n = scanner.nextInt();
            int x3 = n / 100;
            int y3 = (n / 10) % 10;
            int z3 = n % 10;
            int res3 = x3 + y3 + z3;
            System.out.println(res3);
        }

        public static void roundDigits() {
            //Scanner scanner = new Scanner(System.in);
            double n =5.3;
            System.out.println("n = " + n);
            //double n = scanner.nextDouble();
            int new_n = (int) n;
            System.out.println("n = " + new_n);

        }

        public static void findRest(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("q = " );
            int q = scanner.nextInt();
            System.out.println("w = " );
            int w = scanner.nextInt();
            int result = q/w;
            int rest = q % w;
            System.out.println(result + " и " + rest);
        }

        public static void changePlace(){
            int a = 3;
            int b = 4;
            int x = a;
            a = b;
            b = x;

            System.out.println("a=" + a);
            System.out.println("b=" + b);
        }
    }



