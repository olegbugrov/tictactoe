package ru.olegbugrov.tictactoe;

interface OutputGamePosition {

    void outputToConsole(GameField gameField);

    default void outputToGUI() {}

    default void gameResult(String gameResult){}

    void playerTurnMessage(Player player);
}
