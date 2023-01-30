package com.factoriaf5.rps.models;

public abstract class Figure {
    public enum Type {
        ROCK, PAPER, SCISSORS
    }

    public abstract Type getType();
}