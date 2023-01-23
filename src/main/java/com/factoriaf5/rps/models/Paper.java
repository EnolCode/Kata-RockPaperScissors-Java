package com.factoriaf5.rps.models;

public class Paper {

    private boolean alive = true;
    private String type = "paper";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Paper() {

    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void attackRockFromPaper(Rock rock){
        if(rock.getType() == "rock"){
            rock.setAlive(false);
        }
    }

    public void attackScissorsFromPaper(Scissors scissors){
        if(scissors.getType() == "scissors"){
            this.setAlive(false);
        }
    }
}
