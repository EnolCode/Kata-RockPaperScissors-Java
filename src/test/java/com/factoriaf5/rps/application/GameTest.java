package com.factoriaf5.rps.application;

import static org.junit.Assert.*;

import org.junit.Test;

import com.factoriaf5.rps.models.Paper;
import com.factoriaf5.rps.models.Rock;
import com.factoriaf5.rps.models.Scissors;

public class GameTest {
    
    @Test
    public void paper_win_vs_rock() {
        Rock rock = new Rock();
        Paper paper = new Paper();
        paper.attackRockFromPaper(rock);
        assertEquals(true,paper.isAlive());
        assertEquals(false,rock.isAlive());
    }
    @Test
    public void paper_loos_vs_scissors() {
        Scissors scissors = new Scissors();
        Paper paper = new Paper();
        paper.attackScissorsFromPaper(scissors);
        assertEquals(false,paper.isAlive());
        assertEquals(true,scissors.isAlive());
    }

    @Test
    public void scissors_loos_vs_rock() {
        Scissors scissors = new Scissors();
        Rock rock = new Rock();
        scissors.attackRockFromScissors(rock);
        assertEquals(false,scissors.isAlive());
        assertEquals(true,rock.isAlive());
    }

    @Test
    public void sicssors_win_vs_paper() {
        Scissors scissors = new Scissors();
        Paper paper = new Paper();
        scissors.attackPaperFromScissors(paper);
        assertEquals(false,paper.isAlive());
        assertEquals(true,scissors.isAlive());
    }

    @Test
    public void rock_loos_vs_paper() {
        Rock rock = new Rock();
        Paper paper = new Paper();
        rock.attackPaperFromRock(paper);
        assertEquals(true, paper.isAlive());
        assertEquals(false, rock.isAlive());
    }

    @Test
    public void rock_win_vs_scissors() {
        Scissors scissors = new Scissors();
        Rock rock = new Rock();
        rock.attackScissorsFromRock(scissors);
        assertEquals(false,scissors.isAlive());
        assertEquals(true,rock.isAlive());
    }
}
