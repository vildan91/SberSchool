package com.zoo.animal;

public abstract class Animal {
    protected String name;
    public abstract void setName(String name);
    public abstract void talk(String message);
    public abstract void eatFood(String meal);
    public abstract void sleep(int hours);
    public void sleep() {
        sleep(8);
    }

    public String getName() {
        return name;
    }
}
