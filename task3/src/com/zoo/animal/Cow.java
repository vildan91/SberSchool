package com.zoo.animal;

import com.zoo.interfaces.Grazeable;
import com.zoo.interfaces.Milkable;

public class Cow extends Animal implements Milkable, Grazeable {
    public Cow() {
    }

    public Cow(String name) {
        this.name = name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void talk(String message) {
        System.out.println(message + " Muuuu");
    }

    @Override
    public void eatFood(String meal) {
        System.out.println(name + " is fed with " + meal);
    }

    @Override
    public void sleep(int hours) {
        System.out.println(name + " is sleeping for " + hours + " hours");
    }

    @Override
    public void giveMilk(double liters) {
        System.out.println(name + " gave " + liters + " liters of milk");
    }

    @Override
    public void graze(int hours) {
        System.out.println(name + " was grazed for " + hours + " hours");
    }
}
