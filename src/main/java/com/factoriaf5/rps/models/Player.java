package com.factoriaf5.rps.models;

public class Player {
    
    public Figure choose(String string){
        if(string == "rock") return new Rock();
        if(string == "paper") return new Paper();
        if(string == "scissors") return new Scissors();
        return null;
    }
}
