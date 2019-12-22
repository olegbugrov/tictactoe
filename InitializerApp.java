package ru.olegbugrov.tictactoe;


class InitializerApp {
    private GameState gameState = new GameState();
    private GameField gameField = new GameField();
    private Player player1;
    private Player player2;

    InitializerApp() {
        switch (gameState.getKindOfGame()) {
            case COMP:
                this.player1 = new CompPlayerEasy(Token.TOKEN_O.getValToken());
                this.player2 = new CompPlayerEasy(Token.TOKEN_X.getValToken());
                break;
            case HUMAN:
                this.player1 = new CompPlayerEasy(Token.TOKEN_O.getValToken());
                this.player2 = new HumanPlayer(Token.TOKEN_X.getValToken());
                break;
            case BOTH_HUMAN:
                this.player1 = new HumanPlayer(Token.TOKEN_O.getValToken());
                this.player2 = new HumanPlayer(Token.TOKEN_X.getValToken());
                break;
        }
    }

    GameField getGameField() {
        return gameField;
    }

    GameState getGameState() {
        return gameState;
    }

    Player getPlayer1() {
        return player1;
    }

    Player getPlayer2() {
        return player2;
    }
}

