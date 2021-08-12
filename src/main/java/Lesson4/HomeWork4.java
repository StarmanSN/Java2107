package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static final Scanner SCRANNER = new Scanner(System.in);
    public static final Random RAMDOM = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы выиграли!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_0)) {
                System.out.println("Вы проиграли!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Игра закончена");

    }

    /**
     * Проверка на ничью
     */
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    /**
     * Инициализация и заполнение поля
     */
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    /**
     * Отображение игрового поля
     */
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Ход игрока
     */
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты X Y");
            x = SCRANNER.nextInt() - 1;
            y = SCRANNER.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    /**
     * Ход ИИ
     */
    public static void aiTurn() {
        int x, y;
        do {
            x = RAMDOM.nextInt(SIZE);
            y = RAMDOM.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компуктер сходил в точку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_0;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[x][y] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    /**
     * Проверка горизонтали и вертикали
     */
    public static boolean checkLines(char sym) {
        int h;
        int v;
        for (int i = 0; i < SIZE; i++) {
            h = 0;
            v = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == sym) {
                    h++;
                } else if (map[i][j] != sym && h < DOTS_TO_WIN) {
                    h = 0;
                }
                if (map[i][j] == sym) {
                    v++;
                } else if (map[i][j] != sym && v < DOTS_TO_WIN) {
                    v = 0;
                }
            }
            if (h >= DOTS_TO_WIN || v >= DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    /**
     * Проверка диагоналей
     */
    public static boolean checkDiagonals(char sym) {
        int diagL;
        int diagR;
        for (int i = 0; i < SIZE; i++) {
            diagL = 0;
            for (int j = 0; j < SIZE; j++) {
                int l = i + j;
                if (l < SIZE) {
                    if (map[j][l] == sym) {
                        diagL++;
                    } else if (map[i][l] == sym) {
                        diagL = 0;
                    }
                }
                if (diagL >= DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        for (int i = 0; i < SIZE; i++) {
            diagR = 0;
            for (int j = 0; j < SIZE; j++) {
                int l = (SIZE - 1) - j;
                int r = i + j;
                if (l >= 0 && r < SIZE) {
                    if (map[r][l] == sym) {
                        diagR++;
                    } else if (map[r][l] == sym) {
                        diagR = 0;
                    }
                }
                if (diagR >= DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Проверка результата
     */
    public static boolean checkWin(char sym) {
        for (int i = 0; i < DOTS_TO_WIN - 1; i++) {
            for (int j = 0; j < DOTS_TO_WIN - 1; j++) {
                if (checkLines(sym) || checkDiagonals(sym)) {
                    return true;
                }
            }
        }
        return false;
    }
}