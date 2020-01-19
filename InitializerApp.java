package ru.olegbugrov.tictactoe;


class InitializerApp {
    private DataReceiver dataReceiver = new ScannerDataReceiver();
    private GameState gameState = new GameState(dataReceiver);
    private GameField gameField = new GameField();
    private Player player1;
    private Player player2;

    InitializerApp() {
        switch (gameState.getKindOfGame()) {
            case COMP:
                switch (gameState.getComplexity()) {
                    case EASY:
                        this.player1 = new CompPlayerEasy(Token.TOKEN_O.getValToken());
                        this.player2 = new CompPlayerEasy(Token.TOKEN_X.getValToken());
                        break;
                    case MEDIUM:
                        this.player1 = new CompPlayerMedium(Token.TOKEN_O.getValToken());
                        this.player2 = new CompPlayerMedium(Token.TOKEN_X.getValToken());
                        break;
                    case HARD:
                        this.player1 = new CompPlayerHard(Token.TOKEN_O.getValToken());
                        this.player2 = new CompPlayerHard(Token.TOKEN_X.getValToken());
                        break;
                }
                return;
            case HUMAN:
                switch (gameState.getComplexity()) {
                    case EASY:
                        this.player1 = new CompPlayerEasy(Token.TOKEN_O.getValToken());
                        this.player2 = new HumanPlayer(Token.TOKEN_X.getValToken(), dataReceiver);
                        break;
                    case MEDIUM:
                        this.player1 = new CompPlayerMedium(Token.TOKEN_O.getValToken());
                        this.player2 = new HumanPlayer(Token.TOKEN_X.getValToken(), dataReceiver);
                        break;
                    case HARD:
                        this.player1 = new HumanPlayer(Token.TOKEN_O.getValToken(), dataReceiver);
                        this.player2 = new HumanPlayer(Token.TOKEN_X.getValToken(), dataReceiver);
                        break;
                }
                return;
            case BOTH_HUMAN:
                this.player1 = new HumanPlayer(Token.TOKEN_O.getValToken(), dataReceiver);
                this.player2 = new HumanPlayer(Token.TOKEN_X.getValToken(), dataReceiver);
                break;
        }
    }

    GameField getGameField() {
        return gameField;
    }

    Player getPlayer1() {
        return player1;
    }

    Player getPlayer2() {
        return player2;
    }

}

