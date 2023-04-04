package animals.children;

import animals.parents.Animal;

public class Crow extends Animal {
    public Crow(String name, String color) {
        super(name, color,2);
    }

    public Crow(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("said Caw-caw!");
    }

    @Override
    public void swim() {
        System.out.println("crows can't swim");
    }
}
