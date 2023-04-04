package animalsAndHuman.impl;

import animalsAndHuman.*;
import animalsAndHuman.parents.Animal;

import java.io.Serializable;

public class Duck extends Animal implements Illable, Flyable, Speakable, Swimable, Walkable, Serializable {
    public Duck(String name, String color) {
        super(name, color,2);
    }

    public Duck(String name) {
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
    public int getSwimSpeed() {
        return 5;
    }
    @Override
    public int getFlightSpeed() {
        return 10;
    }
    @Override
    public void speak() {
        System.out.println("said: Quack!");
    }

}
