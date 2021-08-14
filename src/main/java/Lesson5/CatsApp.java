package Lesson5;

public class CatsApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "Grey", 3);
        cat.info();
        Cat cat2 = new Cat("Vasya", "black", 2);
        cat2.info();
        System.out.println(cat.getName());

        Cat cat3 = new Cat("Dark grey", 8);
        cat3.info();
        cat3.setName("Murzik");
        cat3.info();

        Car car = new Car("red", 1998, "audi A3");

        System.out.println(cat);

    }
}
