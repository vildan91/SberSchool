package com.zoo;

import com.zoo.animal.Animal;
import com.zoo.exception.AnimalSecondAddException;
import com.zoo.exception.AviaryFullException;

import java.util.HashSet;
import java.util.Set;

public class Aviary {
    private String name;
    private int size;
    private Set<Animal> animals = new HashSet<>();

    public Aviary() {
        this.size = 100;
    }

    public Aviary(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Set<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal) throws AviaryFullException, AnimalSecondAddException {
        if (animals.size() == size) {
            throw new AviaryFullException("Aviary " + this.name + " is full");
        } else if (!animals.add(animal)) {
            throw new AnimalSecondAddException("Animal " + animal.getName() + " already exists in aviary " + this.name);
        }
    }

    public void deleteAnimal(Animal animal) {
        animals.remove(animal);
    }
}
