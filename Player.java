package ru.olegbugrov.tictactoe;

import java.util.Random;
import java.util.Scanner;

abstract class Player {
    char token;

    Player(char token) {
        this.token = token;
    }

    GameField makeMove(GameField gameField, GameState gameState ) {
//        ход компьютера: уровень "easy"
        int count = 0;
        int idxRandomMove = new Random().nextInt(gameField.getNumberOfEmptyPositions());
        Position[][] field = gameField.getGameField();
        for (Position[] positions : field) {
            for (int j = 0; j < field.length; j++) {
                if (positions[j].getValue() != Token.TOKEN_SPACE.getValToken()) continue;
                if (count == idxRandomMove) {
                    positions[j].setValue(token);
                    return gameField;
                }
                count++;
            }
        }
        return gameField;
    }

    char getToken() {
        return token;
    }

}
