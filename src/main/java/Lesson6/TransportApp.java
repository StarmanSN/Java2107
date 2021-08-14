package Lesson6;

public class TransportApp {
    public static void main(String[] args) {
        Bus bus = new Bus("1K", 40, "Ikarus");
        bus.move();
        System.out.println(bus.stopTimeSec());
        MiniBus miniBus = new MiniBus("1k", 14, "Gazel", "Mountain");
        miniBus.move();
        System.out.println(miniBus.stopTimeSec());
        Trolley trolley = new Trolley("452", 45, 1000);
        trolley.move();
        System.out.println(trolley.stopTimeSec());


    }
}
