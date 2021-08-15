package HomeWork6;

public class AnimalApp {

    public static void main(String[] args) {

        // Первый участник
        Dog dog = new Dog();
        dog.setName("Барбос");
        dog.setRun(855.25);
        dog.setSwim(15.5);
        System.out.println(dog.name + " пробежал " + dog.runDistance(dog.getRun()) + " метров" + " и проплыл " + dog.swimDistance(dog.getSwim()) + " метров");
        // System.out.println(dog.name + " проплыл " + dog.swimDistance(dog.getSwim()) + " метров");
        System.out.println();

        // Второй участник
        Cat cat = new Cat();
        cat.setName("Киса");
        cat.setRun(265.12);
        cat.setSwim(0);
        System.out.println(cat.name + " пробежал " + cat.runDistance(cat.getRun()) + " метров, " + cat.name + " не умеет плавать");
        //System.out.println(cat.name + " не умеет плавать");
        System.out.println();

        // Третий участник
        Dog dog1 = new Dog();
        dog1.setName("Шарик");
        dog1.setRun(307.78);
        dog1.setSwim(5.55);
        System.out.println(dog1.name + " пробежал " + dog1.runDistance(dog1.getRun()) + " метров" + " и проплыл " + dog1.swimDistance(dog1.getSwim()) + " метров");
        System.out.println();

        // Четвертый участник
        Cat cat1 = new Cat();
        cat1.setName("Том");
        cat1.setRun(15);
        cat1.setSwim(0);
        System.out.println(cat1.name + " пробежал " + cat1.runDistance(cat1.getRun()) + " метров, " + cat1.name + " не умеет плавать");
        System.out.println();

        // Пятый участник
        Dog dog2 = new Dog();
        dog2.setName("Джерри");
        dog2.setRun(125);
        dog2.setSwim(2.5);
        System.out.println(dog2.name + " пробежал " + dog2.runDistance(dog2.getRun()) + " метров" + " и проплыл " + dog2.swimDistance(dog2.getSwim()) + " метров");
        System.out.println();

        System.out.println("Количество собак: " + Dog.getCountDogs());
        System.out.println("Количество кошек: " + Cat.getCountCats());
        System.out.println("Общее количество животных: " + Animal.getCountAnimals());

    }
}
