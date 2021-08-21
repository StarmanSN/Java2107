package Lesson6;

public abstract class WaterTransport extends Transport{
    protected String startMonth;
    protected String endMonth;

    public abstract void dingDong();

    public WaterTransport(String number, int capacity) {
        super(number, capacity);
    }
}
