package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Figure;
import com.factoriaf5.rps.models.Lizard;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Player;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;
import com.factoriaf5.rps.models.Spock;

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

            if (player2 instanceof Scissors) {
                return "player1 win: rock crushes scissors";
            }
            if (player2 instanceof Lizard) {
                return "player1 win: rock cruches lizard";
            }
        }

        if (player1 instanceof Paper) {
            if (player2 instanceof Rock) {
                return "player1 win: paper covers rock";
            }
            if (player2 instanceof Spock) {
                return "player1 win: paper disproves spock";
            }
        }

        if (player1 instanceof Scissors) {
            if (player2 instanceof Lizard) {
                return "player1 win: scissors decapitates lizard";
            }
            if (player2 instanceof Paper) {
                return "player1 win: scissors cuts paper";
            }
        }

        if (player1 instanceof Spock) {
            if (player2 instanceof Scissors) {
                return "player1 win: spock smashes scissors";
            }
            if (player2 instanceof Rock) {
                return "player1 win: spock vaporizes rock";
            }
        }

        if (player1 instanceof Lizard) {
            if (player2 instanceof Spock) {
                return "player1 win: lizard poisons spock";
            }
            if (player2 instanceof Paper) {
                return "player1 win: lizard eats paper";
            }
        }
        
        return null;
    }
}
