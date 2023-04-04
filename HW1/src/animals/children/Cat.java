package animals.children;

import animals.parents.Animal;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color,4);
    }

    public Cat(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("said Meow!");
    }

    @Override
    public void fly() {
        System.out.println("Cats can't fly!");
    }

    @Override
    public void swim() {
        System.out.println("cats don't swim, they are afraid of water");
    }
}