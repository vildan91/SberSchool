package com.zoo;

import com.zoo.animal.Animal;
import com.zoo.exception.AnimalSecondAddException;
import com.zoo.exception.AviaryFullException;
import com.zoo.exception.NoAviaryException;

import java.util.HashMap;
import java.util.Map;

public class Aviaries {
    public Map<String, Aviary> aviaryMap = new HashMap<>();

    public Map<String, Aviary> getAviaryMap() {
        return aviaryMap;
    }
    public void addAviary(Aviary aviary){
        aviaryMap.put(aviary.getName(), aviary);
    }
    public void addAnimal(String aviaryName, Animal animal) throws AviaryFullException, AnimalSecondAddException, NoAviaryException {
        if (aviaryMap.containsKey(aviaryName)) {
            aviaryMap.get(aviaryName).addAnimal(animal);
        }
        else{
            throw new NoAviaryException("No aviary with name " + aviaryName);
        }
    }
}
