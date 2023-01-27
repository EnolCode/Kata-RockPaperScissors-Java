package com.factoriaf5.rps.application;

import static org.junit.Assert.*;

import org.junit.Test;

import com.factoriaf5.rps.models.Figure;
import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Player;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

public class GameTest {
    
    Player player1 = new Player();
    Player player2 = new Player();
    Game game = new Game();

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

    @Test public void paper_disproves_spock(){
        player1.setFigure(player1.choose("paper"));
        player2.setFigure(player2.choose("spock"));
        assertEquals("player1 win: paper disproves spock", game.whoWin(player1.getFigure(), player2.getFigure()));
    }

    @Test public void paper_covers_rock(){
        player1.setFigure(player1.choose("paper"));
        player2.setFigure(player2.choose("rock"));
        assertEquals("player1 win: paper covers rock", game.whoWin(player1.getFigure(), player2.getFigure()));
    }

    @Test public void lizard_poisons_spock(){
        player1.setFigure(player1.choose("lizard"));
        player2.setFigure(player2.choose("spock"));
        assertEquals("player1 win: lizard poisons spock", game.whoWin(player1.getFigure(), player2.getFigure()));
    }
    
    @Test public void lizard_eats_paper(){
        player1.setFigure(player1.choose("lizard"));
        player2.setFigure(player2.choose("paper"));
        assertEquals("player1 win: lizard eats paper", game.whoWin(player1.getFigure(), player2.getFigure()));
    }

    @Test public void spock_smashes_scissors(){
        player1.setFigure(player1.choose("spock"));
        player2.setFigure(player2.choose("scissors"));
        assertEquals("player1 win: spock smashes scissors", game.whoWin(player1.getFigure(), player2.getFigure()));
    }
    
    @Test public void spock_vaporizes_rock(){
        player1.setFigure(player1.choose("spock"));
        player2.setFigure(player2.choose("rock"));
        assertEquals("player1 win: spock vaporizes rock", game.whoWin(player1.getFigure(), player2.getFigure()));
    }

    @Test public void scissors_decapitates_lizard(){
        player1.setFigure(player1.choose("scissors"));
        player2.setFigure(player2.choose("lizard"));
        assertEquals("player1 win: scissors decapitates lizard", game.whoWin(player1.getFigure(), player2.getFigure()));
    }

    @Test public void scissors_cuts_paper(){
        player1.setFigure(player1.choose("scissors"));
        player2.setFigure(player2.choose("paper"));
        assertEquals("player1 win: scissors cuts paper", game.whoWin(player1.getFigure(), player2.getFigure()));
    }

    @Test public void rock_crushes_scissors(){
        player1.setFigure(player1.choose("rock"));
        player2.setFigure(player2.choose("scissors"));
        assertEquals("player1 win: rock crushes scissors", game.whoWin(player1.getFigure(), player2.getFigure()));
    }

    @Test public void rock_cruches_lizard(){
        player1.setFigure(player1.choose("rock"));
        player2.setFigure(player2.choose("lizard"));
        assertEquals("player1 win: rock cruches lizard", game.whoWin(player1.getFigure(), player2.getFigure()));
    }
}
