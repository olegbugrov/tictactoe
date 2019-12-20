package ru.olegbugrov.tictactoe;


class ManagerApp {

    Player currentPlayer;
    InitializerApp initializerApp = new InitializerApp();
    GameState gameState = initializerApp.getGameState();
    GameField currentField = initializerApp.getGameField();
    OutputGamePosition printerGameField = new PrinterGameField();
    Player firstPlayer = initializerApp.getPlayer1();
    Player secondPlayer = initializerApp.getPlayer2();

    void run() {
        int minMovesToFinish = 5;
        currentPlayer = firstPlayer;
        printerGameField.outputToConsole(currentField);
        do {
            if (minMovesToFinish != 5 && currentPlayer == firstPlayer) {
                currentPlayer = secondPlayer;
            } else if (currentPlayer == secondPlayer) {
                currentPlayer = firstPlayer;
            }
            printerGameField.playerTurnMessage(currentPlayer);
            currentField = currentPlayer.makeMove(currentField, gameState);
            printerGameField.outputToConsole(currentField);
        } while (--minMovesToFinish > 1 || !new Solver(currentPlayer).checkGameCompletion(currentField));
    }
}
