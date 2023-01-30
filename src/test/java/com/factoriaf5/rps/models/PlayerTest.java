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
        assertEquals(Figure.Type.PAPER, paper.getType());
    }

    @Test
    public void test_Player_can_choose_Rock() {
        Figure rock = player1.choose("rock");
        assertEquals(Figure.Type.ROCK, rock.getType());
    }

    @Test
    public void test_Player_can_choose_scissors() {
        Figure scissors = player1.choose("scissors");
        assertEquals(Figure.Type.SCISSORS, scissors.getType());
    }
}
