package com.factoriaf5.rps.models;

public class Player {
    
    private Figure figure;

    public Figure choose(String string){
        if(string == "rock") return new Rock();
        if(string == "paper") return new Paper();
        if(string == "scissors") return new Scissors();
        if(string == "lizard") return new Lizard();
        if(string == "spock") return new Spock();
        return null;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }
}
