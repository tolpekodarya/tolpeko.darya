package Homework9.figura;

public abstract class Figura {
        public abstract double calculateArea();
        public abstract double calculatePerimeter();

        public void displayInfo() {
            System.out.println(this.getClass().getSimpleName() +
                    ": Area = " + calculateArea() +
                    ", Perimeter = " + calculatePerimeter());
        }
    }

