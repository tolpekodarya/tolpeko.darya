package Homework9.figura;

public class Main {
    public static void main(String[] args) {
        Figura[] figures = new Figura[3];

        figures[0] = new Triangle(2, 6, 7);
        figures[1] = new Rectangle(3, 8);
        figures[2] = new Circle(23);


        System.out.println("Information about figures:");
        System.out.println("-".repeat(50));
        double summPerimeter = 0;

        for (int i = 0; i < figures.length; i++) {
            figures[i].displayInfo();
            summPerimeter += figures[i].calculatePerimeter();
        }

        System.out.println("-".repeat(50));
        System.out.printf("Summ of figures' perimeter: %.2f\n", summPerimeter);
    }
}