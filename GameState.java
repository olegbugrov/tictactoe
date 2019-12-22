package ru.olegbugrov.tictactoe;

import java.util.Scanner;

import static java.lang.Integer.parseInt;


class GameState {
    private Complexity complexity;
    private KindOfGame kindOfGame;
    Scanner scanner;

    GameState() {
        this.scanner = new Scanner(System.in);
        int intComplexity, intKindOfGame;
        System.out.print("Введите сложность игры (\"1: easy\", \"2: medium\", \"3: hard\"): ");
        do {
            String strComplexity = scanner.next();
            if (!strComplexity.matches("\\d")) {
                System.out.println("Уровень сложности - целые числа от 1 до 3.");
                continue;
            }
            intComplexity = parseInt(strComplexity);
            if (intComplexity < 1 || intComplexity > 3) {
                System.out.println("Уровень сложности - целые числа от 1 до 3.");
                continue;
            }
            break;
        } while (true);
        switch (intComplexity) {
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
        System.out.print("Введите тип игры (\"1: компьютер-компьютер\", \"2: компьютер- человек\", \"3:человек- человек\"): ");
        do {
            String strKindOfGame = scanner.next();
            if (!strKindOfGame.matches("\\d")) {
                System.out.println("Вид игры - целые числа от 1 до 3.");
                continue;
            }
            intKindOfGame = parseInt(strKindOfGame);
            if (intKindOfGame < 1 || intKindOfGame > 3) {
                System.out.println("Уровень сложности - целые числа от 1 до 3.");
                continue;
            }
            break;
        } while (true);
        switch (intKindOfGame) {
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
