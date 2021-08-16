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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int stopTimeSec() {
        return 4;

    }

}
