package ru.olegbugrov.tictactoe;


class ManagerApp {

    InitializerApp initializerApp = new InitializerApp();
    OutputGamePosition printerGameField = new PrinterGameField();
    GameState gameState = initializerApp.getGameState();
    GameField currentField = initializerApp.getGameField();
    Player firstPlayer = initializerApp.getPlayer1();
    Player secondPlayer = initializerApp.getPlayer2();
    Player currentPlayer;

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
        } while (--minMovesToFinish > 1 || !Solver.getInstance().checkGameCompletion(currentField, currentPlayer));
    }
}
