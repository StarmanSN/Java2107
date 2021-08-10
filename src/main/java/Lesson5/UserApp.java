package Lesson5;

public class UserApp {
    public static void main(String[] args) {
        User user = new User();
        System.out.println("Name = " + user.name + " age = " +user.age);
        user.name = "Ivan";
        user.age = 33;
        System.out.println("Name = " + user.name + " age = " +user.age);
        User user2 = new User();
        user2.name = "Olga";
        user2.age = 17;
        System.out.println("Name = " + user2.name + " age = " +user2.age);
        User user3 = user2;
        System.out.println("Name = " + user3.name + " age = " +user3.age);
    }
}
