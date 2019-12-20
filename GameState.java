package ru.olegbugrov.tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;


class GameState {
    private Complexity complexity;
    private KindOfGame kindOfGame;
    Scanner scanner;

    GameState() {
        this.scanner = new Scanner(System.in);
//        try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Введите сложность игры (\"1: easy\", \"2: medium\", \"3: hard\": ");
        switch (scanner.nextInt()) {
            case 1:
                this.complexity = Complexity.EASY;
                break;
            case 2:
                this.complexity = Complexity.MEDIUM;
                break;
            case 3:
                this.complexity = Complexity.HARD;
                break;
            default:
                System.out.println("Сложность неверная");
                return;
        }
        System.out.print("Введите тип игры (\"1: компьютер-компьютер\", \"2: компьютер- человек\", \"3:человек- человек\": ");
        switch (scanner.nextInt()) {
            case 1:
                this.kindOfGame = KindOfGame.COMP;
                break;
            case 2:
                this.kindOfGame = KindOfGame.HUMAN;
                break;
            case 3:
                this.kindOfGame = KindOfGame.BOTH_HUMAN;
                break;
            default:
                System.out.println("Вид игры неверный");
        }
//        } catch (InputMismatchException e) {
//            System.out.println("Неверный формат данных: " + e);
//        }
    }

    Scanner getScanner() {
        return scanner;
    }

    Complexity getComplexity() {
        return complexity;
    }

    KindOfGame getKindOfGame() {
        return kindOfGame;
    }

}
