package com.zoo.animal;

public class Pigeon extends Animal implements Postable, CarMarkable {
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void talk(String message) {
        System.out.println(message + "[Pigeon voice]");
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
    public void carryLetter(String address) {
        System.out.println(name + " delivers letter to " + address);
    }

    @Override
    public void markTheCar(String carNumber) {
        System.out.println("the car " + carNumber + " needs to go to car wash because of " + name);
    }
}
