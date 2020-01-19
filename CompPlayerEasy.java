package ru.olegbugrov.tictactoe;


class CompPlayerEasy extends Player implements RandomMove{

    CompPlayerEasy(char token) {
        super(token);
    }

    @Override
    GameField makeMove(GameField gameField) {
        return makeRandomMove(gameField, token);
    }
}
