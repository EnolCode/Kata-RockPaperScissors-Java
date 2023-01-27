package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Figure;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Player;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

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

    public String whoWin(Figure player1, Figure player2) {
        if (player1 instanceof Rock) {
            if (player2 instanceof Paper) {
                return "player2 wins using paper vs rock";
            }
            if (player2 instanceof Scissors) {
                return "player1 wins using rock vs scissors";
            }
            if (player2 instanceof Rock) {
                return "players draws using rock vs rock";
            }
        }

        if (player1 instanceof Paper) {
            if (player2 instanceof Rock) {
                return "player1 wins using paper vs rock";
            }
            if (player2 instanceof Scissors) {
                return "player2 wins using scissors vs paper";
            }
            if (player2 instanceof Paper) {
                return "players draws using paper vs paper";
            }
            
        }
        if (player1 instanceof Scissors) {
            if (player2 instanceof Paper) {
                return "player1 wins using scissors vs paper";
            }
            if (player2 instanceof Rock) {
                return "player2 wins using rock vs scissors";
            }
            if (player2 instanceof Scissors) {
                return "players draws using scissors vs scissors";
            }
        }
        return null;
    }
}
