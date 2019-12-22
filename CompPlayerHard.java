package ru.olegbugrov.tictactoe;

public class CompPlayerHard extends Player {
    CompPlayerHard(char token) {
        super(token);
    }

    @Override
    GameField makeMove(GameField gameField, GameState gameState) {
        return null;
    }
}
