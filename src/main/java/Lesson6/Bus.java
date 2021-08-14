package Lesson6;

public class Bus extends Transport {

    protected String model;


    public Bus(String number, int capacity, String model) {
        /// <- здесь пустой конструктор
        super(number, capacity);
        this.model = model;
    }

    public Bus() {
    }

    @Override
    public int stopTimeSec() {
        return 4;

    }

}
