package Homework8;

class Animal {
    void voice() {
        System.out.println("The animal makes a sound.");
    }
    void eat(String food) {
        System.out.println("The animal eats " + food);
    }
}
class Dog extends Animal {
    void voice() {
        System.out.println("Bark!");
    }

    void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Dog likes meat");
        } else {
            System.out.println("Dog dont likes Grass!");
        }
    }
}
class Tiger extends Animal {
    void voice() {
        System.out.println("RRRR!");
    }
    void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Tigger likes meat");
        } else {
            System.out.println("Tigger dont likes Grass!");
        }
    }
}
class Rabbit extends Animal {
    void voice() {
        System.out.println("Purring");
    }
    void eat(String food) {
        if (food.equals("Grass")) {
            System.out.println("Rabbit likes Grass");
        } else {
            System.out.println("Rabbit dont likes Meat!");
        }
    }
}

