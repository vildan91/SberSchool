package com.zoo;

import com.zoo.animal.*;

public class Main {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        chicken.setName("Ryaba");
        chicken.giveEggs(10);
        Cow cow = new Cow();
        cow.setName("Buryonka");
        cow.graze(2);
        cow.giveMilk(10);
        cow.talk("Hello!");
        chicken.talk("Hello!");
        Pigeon pigeon = new Pigeon();
        pigeon.setName("Sizy");
        pigeon.talk("Hello! I'm a pigeon, my name is Sizy");
        pigeon.markTheCar("E447HA716");
    }
}
