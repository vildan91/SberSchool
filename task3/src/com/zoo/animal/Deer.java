package com.zoo.animal;

import com.zoo.exception.HarnessException;
import com.zoo.interfaces.Goreable;
import com.zoo.interfaces.Harnessable;

public class Deer extends Animal implements Goreable, Harnessable {
    public Deer() {
    }
    public Deer(String name) {
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void talk(String message) {
        System.out.println(message + "[deer voice]");
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
    public void goreWithHorns(double force) {
        System.out.println(name + " is pushing with " + force + " Newtons");
    }

    @Override
    public void makeHarness (int deerNumber) throws HarnessException {
        if (deerNumber <= 0) {
            throw new HarnessException("Wrong deer number");
        }
        System.out.println(name + " is in harness with " + deerNumber + " deers");
    }
}
