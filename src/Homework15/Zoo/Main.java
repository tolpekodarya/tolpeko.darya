package Homework15.Zoo;

public class Main {
    public static void main(String[] args) {
        AnimalCollection zoo = new AnimalCollection();


        zoo.addAnimal("Rabbit");
        zoo.addAnimal("Parrot");
        zoo.addAnimal("Tiger");
        zoo.addAnimal("Bear");
        zoo.addAnimal("Lion");
        zoo.addAnimal("Cat");
        zoo.addAnimal("Volf");
        zoo.addAnimal("Fox");
        zoo.show();
        System.out.println("=".repeat(50));

        zoo.removeAnimal();
        zoo.removeAnimal();
        zoo.show();
        System.out.println("=".repeat(50));

        zoo.addAnimal("Volf");
        zoo.addAnimal("Fox");
        zoo.show();
        System.out.println("=".repeat(50));
    }
}