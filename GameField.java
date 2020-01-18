package ru.olegbugrov.tictactoe;


import java.util.Arrays;

class GameField {
    private final int SIZE = 3;
    private Position[][] gameField;


    GameField() {
        gameField = new Position[SIZE][SIZE];
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                gameField[i][j] = new Position(i, j, Token.TOKEN_SPACE.getValToken());
            }
        }
    }

    Position[][] getGameField() {
        return gameField;
    }


    int getNumberOfEmptyPositions() {
//        int count = 0;
//        for (Position[] arr : gameField) {
//            for (Position data : arr) {
//                if (data.getValue() == Token.TOKEN_SPACE.getValToken()) {
//                    count++;
//                }
//            }
//        }
        return ((int) Arrays.stream(gameField)
                .flatMap(Arrays::stream)
                .filter(data -> data.getValue() == Token.TOKEN_SPACE.getValToken())
                .count());
//        return count;
    }

    String getStringGameField() {
        StringBuilder sgf = new StringBuilder();
        for (Position[] str : gameField) {
            for (Position data : str) {
                sgf.append(data.getValue());
            }
        }
        return sgf.toString();
    }
}
