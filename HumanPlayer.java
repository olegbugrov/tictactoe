package ru.olegbugrov.tictactoe;


class HumanPlayer extends Player {

    HumanPlayer(char token) {
        super(token);
    }

    @Override
    GameField makeMove(GameField gameField, GameState gameState) {
        Position[][] field = gameField.getGameField();
        System.out.println("Ведите координаты: X от 1 до 3 (X- по горизонтали, Y- по вертикали, начало координат- левое верхнее поле): ");
        int X = gameState.getDataReceiver().validation();
        int Y = gameState.getDataReceiver().validation();
        do {
            if (field[X - 1][Y - 1].getValue() != ' ') {
                System.out.println("Эта ячейка занята! Выберите другую!");
                continue;
            }
            field[X - 1][Y - 1].setValue(token);
            break;
        } while (true);

        return gameField;
    }

}
