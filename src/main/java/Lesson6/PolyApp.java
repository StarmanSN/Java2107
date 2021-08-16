package Lesson6;

public class PolyApp {
    public static void main(String[] args) {
        // Is a
        Transport bus = new Bus("a123bc", 40, "Liaz");

        Transport miniBus = new MiniBus("b4532c", 20, "Gazel", "Shanson");

        Transport riverShip = new RiverShip("Admiral", 100, 500);

        Transport[] transports = new Transport[]{bus, miniBus, riverShip};

        //Bus [] bases = new Bus[]{bus, miniBus}

        for (Transport transport : transports) {
            if (transport instanceof WaterTransport) {
                System.out.println(transport + " is a ship");
            }
            if (transport.getCapacity() < 30) {
                continue;
            }
            System.out.println(transport);
        }

    }
}
