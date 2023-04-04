import animals.children.*;
import animals.parents.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Tom"));
        animals.add(new Dog("Bob"));
        animals.add(new Duck("Don"));
        animals.add(new Crow("Klara"));
        animals.add(new Fish("Nemo"));
        animals.add(new PolarBear("Umka"));

        for (Animal a: animals) {
            System.out.println(a.getType());
            a.speak();
            a.walk();
            a.fly();
            a.swim();
            System.out.println("-----------------------");
        }

    }
}
