package HomeWork6;

public class Dog extends Animal {
    private static int countDogs;

    public Dog(String name, double run, double swim) {
        super(name, run, swim);

    }

    public Dog() {
        countDogs++;
    }

    @Override
    public double runDistance(double i) {
        double maxDistance = 500;
        if (i < maxDistance) {
            return i;
        }
        return maxDistance;
    }

    @Override
    public double swimDistance(double i) {
        double maxDistance = 10;
        if (i < maxDistance) {
            return i;
        }
        return maxDistance;
    }

    public static int getCountDogs() {
        return countDogs;

    }

}
