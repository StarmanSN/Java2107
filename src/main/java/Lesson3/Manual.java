package Lesson3;

import java.util.Arrays;

public class Manual {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        String[] arr2 = {"A", "B", "C", "D"};
        System.out.println(Arrays.toString(arr2));

        int counter = 1;
        int[][] table = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
