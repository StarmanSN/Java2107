package Lesson2;

public class MethodApp {
    public static void main(String[] args) {
        int calc1 = calculate(4, 6);
        int calc2 = calculate(10, 10);
        int calc3 = calculate(4);
        System.out.println(calc3);

        int calc4 = calculate(calculate(4, 6), calculate(10, 10));

        method1("abs", 100500);
        method1(10500, "asb");

    }

    static void deSomething() {
        System.out.println("Something");
    }

    static int calculate(int a, int b) {
        return 2 * a + b;
    }

    static int calculate(int a) {
        return calculate(a, a);
    }

    public static void method1(String s, int i) {
        System.out.println("Method1 " + s + " " + i);
    }

    public static void method1(int i, String s) {
        System.out.println("Method1 " + s + " " + i);
    }

}