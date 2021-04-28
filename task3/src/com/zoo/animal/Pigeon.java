package com.zoo.animal;

import com.zoo.exception.CarNumberException;
import com.zoo.interfaces.CarMarkable;
import com.zoo.interfaces.Postable;

public class Pigeon extends Animal implements Postable, CarMarkable {
    public Pigeon() {
    }
    public Pigeon(String name) {
        this.name = name;
    }
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
    public void markTheCar(String carNumber) throws CarNumberException {
        if (!isCarNumber(carNumber)) throw new CarNumberException("Wrong car number");
        System.out.println("the car " + carNumber + " needs to go to car wash because of " + name);
    }

    boolean isCarNumber(String carNumber) {
        if (carNumber.length() < 8 || carNumber.length() > 9) return false;

        for (int pos : new int[]{0, 4, 5}) {
            if (!Character.isLetter(carNumber.charAt(pos))) {
                return false;
            }
        }
        int[] digitPositions;
        if (carNumber.length() == 8) {
            digitPositions = new int[]{1, 2, 3, 6};
        } else {
            digitPositions = new int[]{1, 2, 3, 6, 7};
        }
        for (int pos : digitPositions) {
            if (!Character.isDigit(carNumber.charAt(pos))) {
                return false;
            }
        }
        return true;
    }
}
