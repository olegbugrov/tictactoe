package ru.olegbugrov.tictactoe;

enum Token {
    TOKEN_X('X'),
    TOKEN_O('O'),
    TOKEN_SPACE(' ');

    private final char valToken;

    Token(char s) {
        this.valToken = s;
    }

    public char getValToken() {
        return valToken;
    }
}
