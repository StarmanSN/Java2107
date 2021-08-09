package HomeWork3;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {

// Задание 1
        int[] invertArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < invertArray.length; i++) {
            if (invertArray[i] == 1) {
                invertArray[i] = 0;
            } else if (invertArray[i] == 0) {
                invertArray[i] = 1;
            }
        }
        System.out.println(Arrays.toString(invertArray));
        System.out.println();

// Задание 2
        int[] fillArray = new int[100];
        for (int i = 0; i < fillArray.length; i++) {
            fillArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(fillArray));
        System.out.println();

// Задание 3
        int[] changeArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < changeArray.length; i++) {
            if (changeArray[i] < 6) {
                changeArray[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(changeArray));
        System.out.println();

// Задание 4
        int[][] arrDiagonal = new int[5][5];
        arrDiagonal[0][0] = 1;
        arrDiagonal[1][1] = 1;
        arrDiagonal[2][2] = 1;
        arrDiagonal[3][3] = 1;
        arrDiagonal[4][4] = 1;
        arrDiagonal[0][4] = 1;
        arrDiagonal[1][3] = 1;
        arrDiagonal[2][2] = 1;
        arrDiagonal[3][1] = 1;
        arrDiagonal[4][0] = 1;

        for (int i = 0; i < arrDiagonal.length; i++) {
            for (int j = 0; j < arrDiagonal[i].length; j++) {
                System.out.print(arrDiagonal[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println(Arrays.toString(createArguments(5, 7)));
        System.out.println();

// Задание 6
        double[] minAndMaxElements = {17.5, -1.25, 5.25, 132.02, 1.57, 0.66, 25};
        double min = minAndMaxElements[0];
        for (int i = 0; i < minAndMaxElements.length; i++) {
            if (minAndMaxElements[i] < (min)) {
                min = minAndMaxElements[i];
            }
        }
        double max = minAndMaxElements[0];
        for (int i = 0; i < minAndMaxElements.length; i++) {
            if (minAndMaxElements[i] > (max)) {
                max = minAndMaxElements[i];
            }
        }
        System.out.println("Min element is: " + min + " Max is element: " + max);
        System.out.println();

        int[] checkArray = {1, 2, 3, 3, 1, 2};
        System.out.println(checkBalance(checkArray));
    }

// Задание 5
    public static int[] createArguments(int len, int initialValue) {
        int[] result = new int[len];
        Arrays.fill(result, initialValue);
        return result;

    }

// Задание 7
    public static boolean checkBalance(int[] arr) {
        int sumLeft = 0;
        for (int i = 0; i < arr.length; i++) {
            sumLeft += arr[i];
            int sumRight = 0;
            for (int j = 0; j < arr.length; j++) {
                sumRight += (j > i) ? arr[j] : 0;
            }
            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }
}



