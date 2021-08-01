package Lesson3;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] intArray = new int[5];

        intArray[3] = 5;
        intArray[1] = 0;
        intArray[0] = 3;

        System.out.println(intArray[3]);

        for (int i = 0; i < intArray.length; i++) {
            int value = intArray[i];
            System.out.print("intArray[" + i + "] = " + value);
        }
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(createArrayAndFillIt(8, 42)));
        System.out.println(Arrays.toString(createArrayAndFillIt(5, 55)));

        boolean[] boolArray = new boolean[5];
        Arrays.fill(boolArray, true);
        System.out.println(Arrays.toString(boolArray));

        String[] strings = new String[2];
        Arrays.fill(strings, "default value");
        System.out.println(Arrays.toString(strings));

        int[] exampleArr = new int[]{1, 2, 3};

        int[] arr7 = {2, 4, 3, 11, 7, 9, 6, 8, 5, 10, 1};
        System.out.println(Arrays.toString(arr7));
        Arrays.sort(arr7);
        // Comparator.reverseOrder()
        System.out.println(Arrays.toString(arr7));

        //Last element
        System.out.println(arr7[arr7.length - 1]);

    }

    public static int[] createArrayAndFillIt(int length, int valueToFill) {
        int[] result = new int[length];
        Arrays.fill(result, valueToFill);
        return result;
    }

}
