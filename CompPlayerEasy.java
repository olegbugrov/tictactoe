package ru.olegbugrov.tictactoe;


class CompPlayerEasy extends Player implements RandomMove{

    CompPlayerEasy(char token) {
        super(token);
    }

    @Override
    GameField makeMove(GameField gameField, GameState gameState) {
        return makeRandomMove(gameField, token);
    }
}
