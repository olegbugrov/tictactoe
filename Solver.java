package ru.olegbugrov.tictactoe;


class Solver {
    private String gameResult = "Ничья";
    private static Solver solver;

    private Solver() {}

    boolean checkGameCompletion(GameField gameField, Player player) {
        char S = player.getToken();
        String[] winnerTemplates = WinnerTemplates.getWinnerTemplates();
        String fld = gameField.getStringGameField();
        for (String arr : winnerTemplates) {
            int count = 0;
            for (int i = 0; i < arr.length(); i++) {
                if (arr.charAt(i) ==' ') continue;
                if (S != fld.charAt(i)) break;
                if (++count == 3) {
                    gameResult = "Победа";
                    System.out.println(gameResult + "\"" + S + "\""); // переделать вывод результата
                    return true;
                }
            }
        }
        return gameField.getNumberOfEmptyPositions() == 0;
    }
    public static Solver getInstance() {
        if (solver == null) {
            solver = new Solver();
            return solver;
        }
        return solver;
    }

}
