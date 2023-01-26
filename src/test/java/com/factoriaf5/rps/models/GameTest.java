package com.factoriaf5.rps.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GameTest {
    Player  player1;
    Player  player2;
    Game game;
    public GameTest() {
        this.player1 = new Player();
        this.player2 = new Player();
        this.game = new Game();

    }

    @Test
    public void game_start_with_2_players() {
        assertEquals(true, game.getPlayer1() instanceof Player);
        assertEquals(true, game.getPlayer2() instanceof Player);
    }


    @Test
    public void player1_choose_paper_player2_choose_rock() {
        Figure rock = player1.choose("rock");
        Figure paper = player2.choose("paper");

        assertTrue(rock instanceof Rock);
        assertTrue(paper instanceof Paper);
    }



    @Test
    public void paper_win_rock() {
        player1.choose("rock");
        player2.choose("paper");

        assertEquals("Paper win", game.whoWin(player1, player2));
    }

}
