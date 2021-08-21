package HomeWork7;

public class FeedTheCat {
    public static void main(String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Tom", 50);
        cat[1] = new Cat("Matroskin", 50);
        cat[2] = new Cat("Shrek", 40);
        Plate plate = new Plate(100);


        for (Cat i : cat) {
            i.eat(plate);
            System.out.println("Кот " + i.getName() + " Съел " + i.getAppetite() + " гр. корма");
            System.out.println("В тарелке " + plate.getFood() + " гр.");
            i.catsSatiety(plate.getFood());
            if (i.getAppetite() > plate.getFood()) {
                i.isSatiety(true);
                System.out.println("Еды хватило");
            } else if (i.getAppetite() < plate.getFood()) {
                i.isSatiety(false);
                System.out.println("Еда закончилась");
            }
            if (plate.getFood() == 0) {
                do {
                    plate.increaseFood();
                    System.out.println("Добавили еще 50 гр. корма");
                } while (plate.getFood() == 0);
            }

        }
    }
}


