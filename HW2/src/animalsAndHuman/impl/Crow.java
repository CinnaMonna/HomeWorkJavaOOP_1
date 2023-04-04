package animalsAndHuman.impl;

import animalsAndHuman.Flyable;
import animalsAndHuman.Illable;
import animalsAndHuman.Speakable;
import animalsAndHuman.Walkable;
import animalsAndHuman.parents.Animal;

import java.io.Serializable;

public class Crow extends Animal implements Illable, Flyable, Speakable, Walkable, Serializable {
    public Crow(String name, String color) {
        super(name, color, 2);
    }

    public Crow(String name) {
        this(name, null);
    }

    @Override
    public void getIll() {
        System.out.printf("%s %s: got ill\n", this.getType(), this.getName());
    }

    @Override
    public int getWalkSpeed() {
        return 1;
    }

    @Override
    public int getFlightSpeed() {
        return 20;
    }

    @Override
    public void speak() {
        System.out.println("said: Caw-caw!");
    }
}

