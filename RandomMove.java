package ru.olegbugrov.tictactoe;

import java.util.Random;

interface RandomMove {

    default GameField makeRandomMove(GameField gameField, char token){
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
}
