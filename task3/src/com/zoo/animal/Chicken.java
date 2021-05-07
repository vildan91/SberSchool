package com.zoo.animal;

import com.zoo.interfaces.Eggable;
import com.zoo.interfaces.LowFlyable;

public class Chicken extends Animal implements Eggable, LowFlyable {
    public Chicken() {
    }

    public Chicken(String name) {
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void talk(String message) {
        System.out.println(message + " Ko-ko-ko");
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
    public void giveEggs(int number) {
        System.out.println(name + " gave " + number + " eggs");
    }

    @Override
    public void fly(int timeInSeconds) {
        System.out.println(name + " was flying for " + timeInSeconds + " sec");
    }
}
