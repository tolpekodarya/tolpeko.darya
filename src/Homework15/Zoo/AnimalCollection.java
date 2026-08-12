package Homework15.Zoo;
import java.util.ArrayList;

public class AnimalCollection {
    private ArrayList<String> animals = new ArrayList<>();

    public void addAnimal(String animal) {
        animals.add(0, animal);
        System.out.println("Add: " + animal);
    }

    public String removeAnimal() {
        String removed = animals.remove(animals.size() - 1);
        System.out.println("Deleted: " + removed);
        return removed;
    }

    public void show() {
        System.out.println(animals);
    }

}
