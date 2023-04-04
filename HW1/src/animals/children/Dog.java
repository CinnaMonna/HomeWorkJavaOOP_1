package animals.children;

import animals.parents.Animal;

public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color,4);
    }

    public Dog(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("said Woof!");
    }

    @Override
    public void fly() {
        System.out.println("dogs can't fly!");
    }
}
