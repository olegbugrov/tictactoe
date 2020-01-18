package ru.olegbugrov.tictactoe;

public class WinnerTemplates {
    private static final char TEMPLATE_CHAR = 'S';
    private static String[] winnerTemplates;

    private WinnerTemplates() {}


    public static String[] getWinnerTemplates() {
        if (winnerTemplates == null) {
            char S = TEMPLATE_CHAR;
            winnerTemplates = new String[]{"" + S + S + S + "      ", "   " + S + S + S + "   ", "      " + S + S + S,
                    "" + S + "  " + S + "  " + S + "  ", " " + S + "  " + S + "  " + S + ' ', "  " + S + "  " + S + "  " + S,
                    "" + S + "   " + S + "   " + S, "  " + S + ' ' + S + ' ' + S + "  "};
            return winnerTemplates;
        }
        return winnerTemplates;
    }

    public static char getTemplateChar() {
        return TEMPLATE_CHAR;
    }
}
