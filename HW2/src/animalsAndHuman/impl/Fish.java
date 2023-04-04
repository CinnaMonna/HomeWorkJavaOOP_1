package animalsAndHuman.impl;

import animalsAndHuman.Illable;
import animalsAndHuman.Swimable;
import animalsAndHuman.parents.Animal;

import java.io.Serializable;

public class Fish extends Animal implements Illable, Swimable, Serializable {
    public Fish(String name, String color) {
        super(name, color,0);
    }

    public Fish(String name) {
        this(name, null);
    }

    @Override
    public int getSwimSpeed() {
        return 15;
    }

    @Override
    public void getIll() {
        System.out.printf("%s %s: got ill\n", this.getType(), this.getName());
    }


}
