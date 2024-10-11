package org.knit.lab3.src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


class GameBoard extends JFrame {
    private static final int SIZE = 10;
    private final JButton[][] buttons;
    private final List<GetPlayer> players;
    private int currentPlayerIndex = 0;
    private Player selectedFigure = null;
    private JTextArea TextArea;

    public GameBoard(List<GetPlayer> Players) {
        this.players = Players;
        buttons = new JButton[SIZE][SIZE];
        initUI();
    }


    private void initUI() {
        setLayout(new BorderLayout());
        setTitle("Battle");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1200, 900);

        JPanel buttonPanel = new JPanel(new GridLayout(SIZE, SIZE));
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setBackground((i + j) % 2 == 0 ? Color.GREEN : Color.WHITE);
                buttons[i][j].setActionCommand(i + "," + j);
                buttons[i][j].addActionListener(new ButtonClickListener());
                buttonPanel.add(buttons[i][j]);
            }
        }

        TextArea = new JTextArea();
        TextArea.setPreferredSize(new Dimension(300, 30));
        Font newFont = new Font("Comic sans", Font.BOLD, 14);
        TextArea.setFont(newFont);

        add(buttonPanel, BorderLayout.CENTER);
        add(TextArea, BorderLayout.EAST);

        setupFigures();
    }


    private void setupFigures() {
        for (GetPlayer GetPlayer : players) {
            for (Player Player : GetPlayer.getFigures()) {
                int x = Player.getX();
                int y = Player.getY();
                buttons[x][y].setText(GetPlayer.getName() + " " + Player.getName());
            }
        }
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            String command = e.getActionCommand();
            String[] parts = command.split(",");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);

            // Логика перемещения или выбора фигуры
            if (selectedFigure == null) {
                selectFigure(x, y);

            } else if (selectedFigure.getALive()) {
                int maxMove = selectedFigure.getMaxMove();
                int oldX = selectedFigure.getX();
                int oldY = selectedFigure.getY();

                if ((Math.abs(x - oldX) <= maxMove) && (Math.abs(y - oldY) <= maxMove)) {
                    boolean check = true;
                    for (GetPlayer GetPlayer : players) {
                        for (Player figure : GetPlayer.getFigures()) {
                            int altX = figure.getX();
                            int altY = figure.getY();
                            if ((altX == x) && (altY == y)) {
                                check = false;
                                doSomething(x, y, oldX, oldY);
                                break;
                            }
                        }
                        if (!check) {
                            break;
                        }
                    }
                    if (check) {
                        moveSelectedFigure(x, y);
                    }

                }
            }
            //finall();
        }
    }

    private void doSomething(int x, int y, int oldX, int oldY) {
        if (selectedFigure != null) {
            Player first = null;
            Player second = null;
            for (GetPlayer GetPlayer : players) {
                for (Player figure : GetPlayer.getFigures()) {
                    if (oldX == figure.getX() && oldY == figure.getY()) {
                        first = figure;
                    }
                    if (figure.getX() == x && figure.getY() == y) {
                        second = figure;
                    }

                }
            }
            String str = "";
            if (first != null && second != null) {
                str = str + first.getName() + "(" + first.getHealth() + ")" + "->" + first.getDamage() + "->" + second.getName() + "(" + second.getHealth() + ", " + second.getDeff() + ")";
                if (first.getClass() == Mage.class) {
                    first.cast(second);
                } else if (first.getClass() == Warrior.class) {
                    first.attack(second);
                } else if (first.getClass() == Priest.class) {
                    first.heal(second);
                }

                str = str + "->" + second.getHealth();
                TextArea.setText(TextArea.getText() + "\n" + str);


                finals();
            }

        }

    }


    private void selectFigure(int x, int y) {
        GetPlayer currentPlayer = players.get(currentPlayerIndex);
        for (Player Player : currentPlayer.getFigures()) {
            if (Player.getX() == x && Player.getY() == y && Player.getALive()) {
                selectedFigure = Player;
                int maxMove = selectedFigure.getMaxMove();
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        if ((x - maxMove <= i) && (i <= x + maxMove) && (y - maxMove <= j) && (j <= y + maxMove)) {
                            buttons[i][j].setBackground(Color.YELLOW);
                        }
                    }
                }
                return;
            }
        }
    }

    private void moveSelectedFigure(int x, int y) {
        // Проверка на допустимость перемещения
        if (selectedFigure != null) {
            int oldX = selectedFigure.getX();
            int oldY = selectedFigure.getY();

            buttons[oldX][oldY].setText(""); // Убираем фигуру с предыдущей позиции

            selectedFigure.move(x, y); // Двигаем фигуру
            buttons[x][y].setText(players.get(currentPlayerIndex).getName() + "\n" + selectedFigure.getName()); // Устанавливаем фигуру на новую позицию

            finals();
        }
    }

    void finals() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                buttons[i][j].setBackground((i + j) % 2 == 0 ? Color.GREEN : Color.WHITE);
            }
        }
        selectedFigure = null;
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        boolean gameOver;
        for (GetPlayer GetPlayer : players) {
            gameOver = true;
            for (Player figure : GetPlayer.getFigures()) {
                if (!figure.getALive()) {
                    int x = figure.getX();
                    int y = figure.getY();
                    buttons[x][y].setText("Мёртв");
                }
                else {
                    gameOver = false;
                }
            }
            if (gameOver) {
                TextArea.append("\nИгра закончилась!!!");
        }

        }
    }


}

