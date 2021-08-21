package Lesson7;

/**
 * Кот голодный. Кот хочет поесть. Поесть он может с тарелки.
 */
public class App {
    public static void main(String[] args) {
        Cat cat = new Cat("Boris", 20);
        Plate plate = new Plate(100);
        Plate plate2 = new Plate(200);


        //1
        int newAmountOfFood = plate.getAmountOfFood() - cat.getAppetite();
        plate.setAmountOfFood(newAmountOfFood);

        //2
        plate.decreaseAmountOfFood(cat.getAppetite());

        //3
        cat.eat(plate);
        cat.eat(plate2);


        System.out.println(cat);
        System.out.println(plate);
    }

}
