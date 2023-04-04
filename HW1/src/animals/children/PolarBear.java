package animals.children;

import animals.parents.Animal;

public class PolarBear extends Animal {
    public PolarBear(String name, String color) {
        super(name, color,4);
    }

    public PolarBear(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("said Grrr!");
    }

    @Override
    public void fly() {
        System.out.println("bears can't fly!");
    }
}
