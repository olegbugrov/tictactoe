package ru.olegbugrov.tictactoe;


class GameState {
    private Complexity complexity;
    private KindOfGame kindOfGame;

    GameState(DataReceiver dataReceiver) {
        System.out.print("Введите тип игры (\"1: компьютер-компьютер\", \"2: компьютер- человек\", \"3:человек- человек\"): ");
        switch (dataReceiver.receivingData()) {
            case 1:
                this.kindOfGame = KindOfGame.COMP;
                break;
            case 2:
                this.kindOfGame = KindOfGame.HUMAN;
                break;
            case 3:
                this.kindOfGame = KindOfGame.BOTH_HUMAN;
                this.complexity = Complexity.UNDEFINED;
                break;
        }
        if (complexity == Complexity.UNDEFINED) return;
        System.out.print("Введите сложность игры (\"1: easy\", \"2: medium\", \"3: hard\"): ");
        switch (dataReceiver.receivingData()) {
            case 1:
                this.complexity = Complexity.EASY;
                break;
            case 2:
                this.complexity = Complexity.MEDIUM;
                break;
            case 3:
                this.complexity = Complexity.HARD;
                break;
        }
    }

    Complexity getComplexity() {
        return complexity;
    }

    KindOfGame getKindOfGame() {
        return kindOfGame;
    }
}
