package animalsAndHuman.impl;

import animalsAndHuman.Illable;
import animalsAndHuman.Speakable;
import animalsAndHuman.Walkable;
import animalsAndHuman.parents.Animal;

import java.io.Serializable;

public class Cat extends Animal implements Illable, Speakable, Walkable, Serializable {
    public Cat(String name, String color) {
        super(name, color,4);
    }

    public Cat(String name) {
        this(name, null);
    }
    @Override
    public void getIll() {
        System.out.printf("%s %s: got ill\n", this.getType(), this.getName());
    }

    @Override
    public int getWalkSpeed() {
        return 15;
    }

    @Override
    public void speak() {
        System.out.printf("%s %s said: Meow!\n", getType(), getName());
    }
}