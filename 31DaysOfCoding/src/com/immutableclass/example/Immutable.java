package com.immutableclass.example;

public class Immutable {
    private final int immutableValue;

    public Immutable(int immutableValue) {
        this.immutableValue = immutableValue;
    }

    public int getValue() {
        return immutableValue;
    }
}