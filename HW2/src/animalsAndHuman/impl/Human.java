package animalsAndHuman.impl;

import animalsAndHuman.Illable;
import animalsAndHuman.Speakable;
import animalsAndHuman.Swimable;
import animalsAndHuman.Walkable;

import java.io.Serializable;

public class Human implements Illable, Speakable, Walkable, Swimable, Serializable {
    private String name;
    private Integer age;
    private String profession;
    public Human(String name, Integer age, String profession){
        this.name = name;
        this.age = age;
        this.profession = profession;
    }
    public Human(String name){
        this(name, 0, null);
    }
    @Override
    public String toString() {
        return String.format("%s %s", getType(), this.name);
    }
    @Override
    public int getSwimSpeed() {
        return 1;
    }

    @Override
    public int getWalkSpeed() {
        return 5;
    }

    @Override
    public void speak() {
        System.out.println("said: Hello!");
    }

    @Override
    public void getIll() {
        System.out.printf("%s %s: got ill\n", this.getType(), this.getName());
    }
    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }
}
