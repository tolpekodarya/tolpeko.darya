package Homework8;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        System.out.println("Dog: ");
        dog.voice();
        dog.eat("Meat");
        dog.eat("Grass");
        System.out.println("-".repeat(70));

        Animal tiger = new Tiger();
        System.out.println("Tiger:");
        tiger.voice();
        tiger.eat("Meat");
        System.out.println("-".repeat(70));

        Animal rabbit = new Rabbit();
        System.out.println("Rabbit:");
        rabbit.voice();
        rabbit.eat("Grass");
        rabbit.eat("Meat");
        System.out.println("-".repeat(70));
    }
}

