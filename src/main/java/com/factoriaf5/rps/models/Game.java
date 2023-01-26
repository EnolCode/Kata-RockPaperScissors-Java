package com.factoriaf5.rps.models;

public class Game {
    Player player1;
     Player player2;

    public Game() {
        this.player1 = new Player();
        this.player2 = new Player();
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public  String whoWin(Player player1, Player player2) {
        if(player1.choose("rock").getType() == "rock" && player2.choose("paper").getType() == "paper"){
            return "Paper win";
        }
        return null;
    }
}
