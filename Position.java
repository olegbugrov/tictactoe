package ru.olegbugrov.tictactoe;

class Position {
    protected int positionX;
    protected int positionY;
    protected char value;

    Position(int positionX, int positionY, char value) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    char getValue() {
        return value;
    }

    void setValue(char value) {
        this.value = value;
    }
}
