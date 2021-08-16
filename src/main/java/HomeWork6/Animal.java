package HomeWork6;

public abstract class Animal {
    protected String name;
    protected double run;
    protected double swim;
    private static int countAnimals;

    public Animal(String name, double run, double swim) {
        this();
        this.name = name;
        this.run = run;
        this.swim = swim;

    }

    public Animal() {
        countAnimals++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRun() {
        return run;
    }

    public void setRun(double run) {
        this.run = run;
    }

    public double getSwim() {
        return swim;
    }

    public void setSwim(double swim) {
        this.swim = swim;
    }

    public abstract double runDistance(double i);

    public abstract double swimDistance(double i);

    public static int getCountAnimals() {
        return countAnimals;
    }
}
