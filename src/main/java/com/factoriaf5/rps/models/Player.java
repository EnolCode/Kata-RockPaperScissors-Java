package com.factoriaf5.rps.models;

public class Player {
    private Figure figure;

    public Figure chooseFigure(String string) {
        this.figure = FigureFactory.createFigure(string);
        return this.figure;
    }

    public Figure getFigure() {
        return figure;
    }
}
