package com.factoriaf5.rps.models;

public class Rock {
    private boolean alive = true;
    private String type = "rock";
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
    public Rock() {

    }

    public void attackPaperFromRock(Paper paper){
        if(paper.getType() == "paper"){
            this.setAlive(false);
        }
    }

    public void attackScissorsFromRock(Scissors scissors){
        if(scissors.getType() == "scissors"){
            scissors.setAlive(false);
        }
    }
    
}
