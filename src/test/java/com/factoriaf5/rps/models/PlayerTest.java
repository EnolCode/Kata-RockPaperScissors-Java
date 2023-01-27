package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerTest {

    private Player player1;

    public PlayerTest() {
        this.player1 = new Player();
    }

    @Test
    public void test_Player_can_choose_Paper() {
        Figure paper = player1.choose("paper");
        assertEquals("paper", paper.getType());
    }

    @Test
    public void test_Player_can_choose_Rock() {
        Figure rock = player1.choose("rock");
        assertEquals("rock", rock.getType());
    }

    @Test
    public void test_Player_can_choose_scissors() {
        Figure scissors = player1.choose("scissors");
        assertEquals("scissors", scissors.getType());
    }

    @Test
    public void asdas() {
        Game game = new Game();
        Player player11 = new Player();
        Player player22 = new Player();

        player11.choose("rock");
        player22.choose("paper");

        
    }
}
