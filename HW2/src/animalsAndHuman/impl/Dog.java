package animalsAndHuman.impl;

import animalsAndHuman.Illable;
import animalsAndHuman.Speakable;
import animalsAndHuman.Swimable;
import animalsAndHuman.Walkable;
import animalsAndHuman.parents.Animal;

import java.io.Serializable;

public class Dog extends Animal implements Illable, Speakable, Walkable, Swimable, Serializable {
    public Dog(String name, String color) {
        super(name, color,4);
    }

    public Dog(String name) {
        this(name, null);
    }
    @Override
    public void getIll() {
        System.out.printf("%s %s: got ill\n", this.getType(), this.getName());
    }

    @Override
    public int getSwimSpeed() {
        return 2;
    }

    @Override
    public int getWalkSpeed() {
        return 15;
    }

    @Override
    public void speak() {
        System.out.println("said: Woof!");
    }

}
