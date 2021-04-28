package com.zoo.interfaces;

import com.zoo.exception.CarNumberException;

public interface CarMarkable {
    void  markTheCar(String carNumber) throws CarNumberException;
}
