package com.zoo.interfaces;

import com.zoo.exception.HarnessException;

public interface Harnessable {
    void makeHarness(int deerNumber) throws HarnessException;
}
