package HomeWork6;

public class Cat extends Animal {
    private static int countCats;

    public Cat(String name, double run, double swim) {
        super(name, run, swim);

    }

    public Cat() {
        countCats++;
    }

    @Override
    public double runDistance(double i) {
        double maxDistance = 200;
        if (i < maxDistance) {
            return i;
        }
        return maxDistance;
    }

    @Override
    public double swimDistance(double i) {
        return 0;
    }

    public static int getCountCats() {
        return countCats;

    }
}
