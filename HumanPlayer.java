package ru.olegbugrov.tictactoe;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

class HumanPlayer extends Player {

    HumanPlayer(char token) {
        super(token);
    }

    @Override
    GameField makeMove(GameField gameField, GameState gameState) {
        System.out.println("Ведите координаты: X от 1 до 3 (X- по горизонтали, Y- по вертикали, начало координат- левое верхнее поле): ");
        int X, Y;
        Position[][] field = gameField.getGameField();
        Scanner sc = gameState.getScanner();
        do {
            String strX = sc.next();
            String strY = sc.next();
            if (!strX.matches("\\d") || !strY.matches("\\d")) {
                System.out.println("Координаты - целые числа от 1 до 3.");
                continue;
            }
            X = parseInt(strX);
            Y = parseInt(strY);
            if (X < 1 || X > 3 || Y < 1 || Y > 3) {
                System.out.println("Координаты - целые числа от 1 до 3.");
                continue;
            }
            if (field[X - 1][Y - 1].getValue() != ' ') {
                System.out.println("Эта ячейка занята! Выберите другую!");
                continue;
            }
            field[X - 1][Y - 1].setValue(token);
            break;
        } while (true);

        return gameField;
    }

}
