package Homework9.company;

public class Main {
    public static void main(String[] args) {
    PositionPrinter director = new Director();
    PositionPrinter worker = new Worker();
    PositionPrinter accountant = new Accountanter();

    director.printPosition();
    worker.printPosition();
    accountant.printPosition();
}
}
