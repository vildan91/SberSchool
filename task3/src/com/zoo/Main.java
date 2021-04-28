package com.zoo;

import com.zoo.animal.*;
import com.zoo.exception.AnimalSecondAddException;
import com.zoo.exception.AviaryFullException;
import com.zoo.exception.CarNumberException;
import com.zoo.exception.HarnessException;

public class Main {
    public static void main(String[] args) {
        Chicken chicken = new Chicken("Ryaba");
        chicken.giveEggs(10);
        Cow cow = new Cow("Buryonka");
        cow.graze(2);
        cow.giveMilk(10);
        cow.talk("Hello!");
        chicken.talk("Hello!");
        Pigeon pigeon = new Pigeon("Sizy");
        pigeon.talk("Hello! I'm a pigeon");
        try {
            pigeon.markTheCar("A 01AA716");
        }
        catch (CarNumberException e) {
            System.out.println(e.getMessage());
        }
        Deer deer = new Deer("Oscar");
        try {
            deer.makeHarness(0);
        }
        catch (HarnessException e) {
            System.out.println(e.getMessage());
        }
        Aviary aviary1 = new Aviary("Birds", 3);
        try {
            aviary1.addAnimal(chicken);
            aviary1.addAnimal(pigeon);
            aviary1.addAnimal(new Eagle("Eeaaggllee"));
            aviary1.addAnimal(new Pigeon("Pig"));
        } catch (AviaryFullException e) {
            e.printStackTrace();
        } catch (AnimalSecondAddException e) {
            e.printStackTrace();
        }
        for (Animal ani : aviary1.getAnimals()){
            System.out.println(ani.getName());
        }
    }
}
