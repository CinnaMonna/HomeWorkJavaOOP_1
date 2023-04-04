package animals.children;

import animals.parents.Animal;

public class Fish extends Animal {
    public Fish(String name, String color) {
        super(name, color,0);
    }

    public Fish(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("fishes can't speak!");
    }

    @Override
    public void walk() {
        System.out.println("fishes can't walk!");
    }

    @Override
    public void fly() {
        System.out.println("fishes can't fly!");
    }

}
