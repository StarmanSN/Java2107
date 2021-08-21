package HomeWork7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
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

    public boolean isSatiety(boolean satiety) {
        if (satiety) {
            System.out.println(name + " наелся");
            return true;
        } else
            System.out.println(name + " не наелся");
        return false;

    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void catsSatiety(int plate) {
        if (appetite <= plate || plate == 0) {
            satiety = true;
        } else {
            satiety = false;
        }
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                '}';
    }
}
