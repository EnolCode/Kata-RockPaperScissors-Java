package com.factoriaf5.rps.application;

import javax.swing.JOptionPane;

import com.factoriaf5.rps.models.Player;

public class UsoGame {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        String figure1 = JOptionPane.showInputDialog("Escoge la figura.");
        String figure2 = JOptionPane.showInputDialog("Escoge la figura.");

         player1.setFigure(player1.choose(figure1));
         player2.setFigure(player2.choose(figure2));
        
        Game game = new Game();
        JOptionPane.showMessageDialog(null, game.whoWin(player1.getFigure(), player2.getFigure()), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
