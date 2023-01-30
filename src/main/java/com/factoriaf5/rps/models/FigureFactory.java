package com.factoriaf5.rps.models;

public  class FigureFactory {
    
    public static Figure createFigure(String figureType){
        if(figureType.equalsIgnoreCase("rock")) return new Rock();
        if(figureType.equalsIgnoreCase("paper")) return new Paper();
        if(figureType.equalsIgnoreCase("scissors")) return new Scissors();
        if(!figureType.equalsIgnoreCase("scissors") &&
            !figureType.equalsIgnoreCase("paper") &&
            !figureType.equalsIgnoreCase("rock")) {
                throw new IllegalArgumentException("La figura introducida no es valida");
            }
        return null;
    }

}
