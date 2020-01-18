package ru.olegbugrov.tictactoe;

class PrinterGameField implements OutputGamePosition {


    @Override
    public void outputToConsole(GameField gameField) {
        StringBuilder result = new StringBuilder("---------\n");
        for (Position[] arr : gameField.getGameField()) {
            result.append("| ");
            for (Position data : arr) {
                result.append(data).append(" ");
            }
            result.append("|\n");
        }
        result.append("---------\n");
        System.out.println(result.toString());
    }

    public void playerTurnMessage(Player player) {
        System.out.println("Ход Игрока\"" + player.getToken() + "\"");
    }
}

