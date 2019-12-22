package ru.olegbugrov.tictactoe;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

class DataReceiver {
    Scanner scanner = new Scanner(System.in);


    int validation() {
        int result;
        do {
            String str = scanner.next();
            if (!str.matches("\\d")) {
                System.out.println("Ожидаются целые числа от 1 до 3.");
                continue;
            }
            result = parseInt(str);
            if (result < 1 || result > 3) {
                System.out.println("Ожидаются целые числа от 1 до 3.");
                continue;
            }
            break;
        } while (true);

        return result;
    }
}
