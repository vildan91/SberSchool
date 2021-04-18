package com.zoo.animal;

public class Frog extends Animal implements Swimable, Hibernatable {
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void talk(String message) {
        System.out.println(message + " Kva-kva-kva");
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
    public void Hibernate(int weeks) {
        sleep(weeks * 7 * 24);
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }
}
