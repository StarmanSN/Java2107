package Lesson6;

public class Trolley extends Transport {

    private int power;

    public Trolley(String number, int capacity, int power) {
        super(number, capacity);
        this.power = power;

    }

    public Trolley(int power) {
        this.power = power;
    }

    @Override
    public void move() {
        System.out.println("Trolley is out of energy");;
    }

    @Override
    public int stopTimeSec() {
        return 7;
    }
}
