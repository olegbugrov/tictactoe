package ru.olegbugrov.tictactoe;


class Solver {
    private char S;
    private String gameResult = "Ничья";
    private String[] winnerTemplates;

    Solver(Player player) {
        this.S = player.getToken();
        this.winnerTemplates = new String[]{"" + S + S + S + "      ", "   " + S + S + S + "   ", "      " + S + S + S,
                S + "  " + S + "  " + S + "  ", " " + S + "  " + S + "  " + S + ' ', "  " + S + "  " + S + "  " + S,
                S + "   " + S + "   " + S, "  " + S + ' ' + S + ' ' + S + "  "};
    }

    boolean checkGameCompletion(GameField gameField) {
        String fld = gameField.getStringGameField();
        for (String arr : winnerTemplates) {
            int count = 0;
            for (int i = 0; i < arr.length(); i++) {
                if (arr.charAt(i) != S) continue;
                if (arr.charAt(i) != fld.charAt(i)) break;
                if (++count == 3) {
                    gameResult = "Победа";
                    System.out.println(gameResult + "\"" + S + "\""); // переделать вывод результата
                    return true;
                }
            }
        }
        return gameField.getNumberOfEmptyPositions() == 0;
    }
}
//    void getWinner() {
//        switch (gameResult) {
//            case "Ничья":
//                System.out.println(gameResult);
//                break;
//            case "Победа":
//                System.out.println(gameResult + "\"" + S + "\"");
//                break;
//            default:
//                System.out.println("Результат неизвестен :)");
//        }
//    }
