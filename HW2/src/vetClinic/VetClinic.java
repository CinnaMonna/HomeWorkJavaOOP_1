package vetClinic;

import animalsAndHuman.Flyable;
import animalsAndHuman.Speakable;
import animalsAndHuman.Swimable;
import animalsAndHuman.Walkable;
import animalsAndHuman.impl.Doctor;
import animalsAndHuman.parents.Animal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private final List<Animal> animals;
    private final List<Doctor> doctors;
    public VetClinic() {
        this.animals = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }
    public VetClinic addAnimal(Animal animal){
        this.animals.add(animal);
        return this;
    }
    public VetClinic addDoctor(Doctor doctor){
        this.doctors.add(doctor);
        return this;
    }
    public List<Flyable> getAllFlyables(){
        List<Flyable> flyables = new ArrayList<>();
        for(Animal a : this.animals) {
            if(a instanceof Flyable){
                flyables.add((Flyable) a);
            }
        }
        return flyables;
    }
    public List<Walkable> getAllWalkables(){
        List<Walkable> walkables = new ArrayList<>();
        for(Animal a : this.animals) {
            if(a instanceof Walkable){
                walkables.add((Walkable) a);
            }
        }
        return walkables;
    }
    public List<Swimable> getAllSwimables(){
        List<Swimable> swimables = new ArrayList<>();
        for(Animal a : this.animals) {
            if(a instanceof Swimable){
                swimables.add((Swimable) a);
            }
        }
        return swimables;
    }
    public List<Speakable> getAllSpeakables(){
        List<Speakable> speakables = new ArrayList<>();
        for(Animal a : this.animals) {
            if(a instanceof Speakable){
                speakables.add((Speakable) a);
            }
        }
        return speakables;
    }
    public List<Animal> getAllAnimals(){
        return this.animals;
    }
    public List<Doctor> getAllDoctors(){
        return this.doctors;
    }
    public List<Serializable> getAllBeings(){
        List<Serializable> allBeings = new ArrayList<>();
        for(Animal a : this.animals) {
            if(a instanceof Serializable) allBeings.add((Serializable) a);
        }
        for(Doctor d : this.doctors) {
            if(d instanceof Serializable) allBeings.add((Serializable) d);
        }
        return allBeings;
    }

}
