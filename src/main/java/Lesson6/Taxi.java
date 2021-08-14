package Lesson6;

public class Taxi extends Transport {

    private String tariff;

    public Taxi(String number, int capacity, String number1, int capacity1, String tariff) {
        super(number, capacity);
        this.number = number1;
        this.capacity = capacity1;
        this.tariff = tariff;
    }

    @Override
    public int stopTimeSec() {
        return 0;
    }
}
