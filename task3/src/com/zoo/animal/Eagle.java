package com.zoo.animal;

import com.zoo.interfaces.FlyHuntable;
import com.zoo.interfaces.HighFlyable;

public class Eagle extends Animal implements FlyHuntable, HighFlyable {
    public Eagle() {
    }
    public Eagle(String name) {
        this.name = name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void talk(String message) {
        System.out.println(message + "[Klekot]");
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
    public void Hunt(String victim) {
        System.out.println(name + " attacked " + victim);
    }

    @Override
    public void fly(int timeInMinutes) {
        System.out.println(name + " was flying for " + timeInMinutes + " min");
    }
}
