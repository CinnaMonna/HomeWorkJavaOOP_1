package animalsAndHuman.impl;

import animalsAndHuman.Illable;
import animalsAndHuman.Speakable;
import animalsAndHuman.Swimable;
import animalsAndHuman.Walkable;
import animalsAndHuman.parents.Animal;

import java.io.Serializable;

public class PolarBear extends Animal implements Illable, Speakable, Walkable, Swimable, Serializable {
    public PolarBear(String name, String color) {
        super(name, color,4);
    }

    public PolarBear(String name) {
        this(name, null);
    }
    @Override
    public void getIll() {
        System.out.printf("%s %s: got ill\n", this.getType(), this.getName());
    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }

    @Override
    public int getWalkSpeed() {
        return 10;
    }

    @Override
    public void speak() {
        System.out.println("said: Grrr!");
    }

}
