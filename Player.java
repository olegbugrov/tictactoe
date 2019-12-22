package ru.olegbugrov.tictactoe;


abstract class Player {
    char token;

    Player(char token) {
        this.token = token;
    }

    abstract GameField makeMove(GameField gameField, GameState gameState);

    char getToken() {
        return token;
    }

}
