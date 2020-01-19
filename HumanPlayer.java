package ru.olegbugrov.tictactoe;


class HumanPlayer extends Player{
    private DataReceiver dataReceiver;

    HumanPlayer(char token, DataReceiver dataReceiver) {
        super(token);
        this.dataReceiver = dataReceiver;
    }

    @Override
    GameField makeMove(GameField gameField) {
        Position[][] field = gameField.getGameField();
        do {
            System.out.println("Ведите координаты: X от 1 до 3 (X- по горизонтали, Y- по вертикали, начало координат- левое верхнее поле): ");
            int X = dataReceiver.receivingData();
            int Y = dataReceiver.receivingData();
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
