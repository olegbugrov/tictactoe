package ru.olegbugrov.tictactoe;



public class CompPlayerMedium extends Player implements RandomMove{
    private int moveCounter;

    CompPlayerMedium(char token) {
        super(token);
    }

    @Override
    GameField makeMove(GameField gameField) {
        String fld = gameField.getStringGameField();
        int idx = -1;
        if (moveCounter++ > 0) {
            idx = checkOneStepToWin(fld);
        }
        if (idx == -1) {
            return makeRandomMove(gameField, token);
        }
        Position[][] field = gameField.getGameField();
        field[idx / 3][idx % 3].setValue(token);
        return gameField;
    }

    int checkOneStepToWin(String field) {
        char sign = token;
        String[] winnerTemplates = WinnerTemplates.getWinnerTemplates();
        int idxToMove = -1;
        int count = 1;
        while (count <= 2) {
            for (String winnerTemplate : winnerTemplates) {
                int countToken = 0;
                int countEmpty = 0;
                for (int j = 0; j < winnerTemplate.length(); j++) {
                    if (winnerTemplate.charAt(j) == ' ') continue;
                    if (field.charAt(j) == ' ') {
                        countEmpty++;
                        idxToMove = j;
                    } else if (sign == field.charAt(j)) {
                        countToken++;
                    }
                }
//                System.out.println("countToken =" + countToken + ", countEmpty = " + countEmpty + ", sign =" + sign);
                if (countToken == 2 && countEmpty == 1) {
                    return idxToMove;
                }
            }
            count++;
            sign = getRivalToken(sign);
        }
        return -1;
    }

    char getRivalToken(char S) {
        if(S == 'X') return 'O';
        return 'X';
    }
}
