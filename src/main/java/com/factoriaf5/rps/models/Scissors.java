package com.factoriaf5.rps.models;

public class Scissors {
    private boolean alive = true;
    private String type = "scissors";
    public Scissors() {

    }
    public boolean isAlive() {
        return alive;
    }
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
    public void attackPaperFromScissors(Paper paper){
        if(paper.getType() == "paper"){
            paper.setAlive(false);
        }
    }

    public void attackRockFromScissors(Rock rock){
        if(rock.getType() == "rock"){
            this.setAlive(false);
        }
    }

}
