package Lesson7;

public class Cat {

    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    /**
     * Даем коту тарелку, он из ее ест
     *
     * @param plate тарелка откуда поесть
     */

    public void eat(Plate plate) {
//        if (this.appetite() > plate.getAmountOfFood()){
//            // не наелся
//        }
//        plate.decreaseAmountOfFood((this.appetite));

        plate.decreaseAmountOfFood(this.getAppetite());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }
}
