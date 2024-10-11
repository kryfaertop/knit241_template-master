package org.knit.lab3.src;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Создание игроков и добавление фигур

            GetPlayer player1 = new GetPlayer("Иг_1");
            player1.addFigure(new Mage(3, 3));
            player1.addFigure(new Warrior(3, 4));
            player1.addFigure(new Priest(3, 5));

            GetPlayer player2 = new GetPlayer("Иг_2");
            player2.addFigure(new Mage(5, 3));
            player2.addFigure(new Warrior(5, 4));
            player2.addFigure(new Priest(5, 5));

            List<GetPlayer> player = new ArrayList<>();
            player.add(player1);
            player.add(player2);

            GameBoard gameBoard = new GameBoard(player);
            gameBoard.setVisible(true);


        });
    }
}
