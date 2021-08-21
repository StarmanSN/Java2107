package HomeWork7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
            return food;
    }

    public void setFood(int food) {

            this.food = food;

    }
    public void increaseFood(){
        if (food == 0) {
            food += 50;
        }
    }
    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        } else food = 0;
    }

    public void info() {
        System.out.println("Тарелка:" + food);
    }

    @Override
    public String toString() {
        return "Plates{" +
                "food=" + food +
                '}';
    }
}
