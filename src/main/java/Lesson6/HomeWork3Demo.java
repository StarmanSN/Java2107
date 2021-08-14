package Lesson6;

public class HomeWork3Demo {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
      reverseArray();
    }

    public static void reverseArray() {
        int[] arr = new int[]{0, 1, 1, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    /**
     * Меняет в текущем массиве
     * @param arr
     * @return
     */
    public static int[] reverseArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }
}
