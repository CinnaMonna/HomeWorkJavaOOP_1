import animalsAndHuman.Flyable;
import animalsAndHuman.Illable;
import animalsAndHuman.Swimable;
import animalsAndHuman.impl.*;
import animalsAndHuman.parents.Animal;
import vetClinic.VetClinic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();
        Cat cat1 = new Cat("Basilio");
        Doctor doctor1 = new Doctor("Aibolit");

        vetClinic
                .addAnimal(cat1)
                .addAnimal(new Dog("Bim"))
                .addAnimal(new Duck("Utich"))
                .addAnimal(new Crow("Klara"))
                .addAnimal(new Fish("Nemo"))
                .addAnimal(new PolarBear("Umka"));
        vetClinic
                .addDoctor(doctor1)
                .addDoctor(new Doctor("Fedora"))
                .addDoctor(new Doctor("Barmaley"));

        System.out.printf("All animals in vet. clinic:\n%s\n---------------\n",
                vetClinic.getAllAnimals());
        System.out.printf("All doctors in vet. clinic:\n%s\n---------------\n",
                vetClinic.getAllDoctors());
        System.out.printf("All flying animals in vet. clinic:\n%s\n---------------\n",
                vetClinic.getAllFlyables());
        System.out.printf("All walking animals in vet. clinic:\n%s\n---------------\n",
                vetClinic.getAllWalkables());
        System.out.printf("All swimming animals in vet. clinic:\n%s\n---------------\n",
                vetClinic.getAllSwimables());
        System.out.printf("All speaking animals in vet. clinic:\n%s\n---------------\n",
                vetClinic.getAllSpeakables());
        System.out.printf("All beings (doctors and animals) in vet. clinic:\n%s\n---------------\n",
                vetClinic.getAllBeings());

        System.out.printf("Count of all animals: %d\n---------------\n",
                Animal.getAnimalsCount());

        cat1.getIll();
        doctor1.treat();
        cat1.speak();
        System.out.println("---------------");


        for (Flyable f : vetClinic.getAllFlyables()) {
            System.out.printf("%s %s: flight speed = %d\n",
                    ((Animal) f).getType(), ((Animal) f).getName(), f.getFlightSpeed());
        }
        System.out.println("---------------");

        for (Swimable s : vetClinic.getAllSwimables()) {
            System.out.printf("%s %s: swimming speed = %d\n",
                    ((Animal) s).getType(), ((Animal) s).getName(), s.getSwimSpeed());
        }
        System.out.println("---------------");

    }
}
