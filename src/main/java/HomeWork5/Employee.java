package HomeWork5;

import java.util.Arrays;

public class Employee {
    private String name;
    private String position;
    private String email;
    private long phoneNumber;
    private double salary;
    private int age;


    public Employee(String name, String position, String email, long phoneNumber, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public int getAge() {

        return age;
    }

//    public void information() {
//        System.out.println(this);
//    }

    public static void main(String[] args) {
        System.out.println();
//        Employee employee = new Employee("Putin Vovan ", "Lowyer", "putinnumber1@gmail.com", 891231212, 12499.99,70);
//        employee.information();

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Bush Jr. George", "accountant", "invisiblebush@yandex.ru", 892512352, 11999, 70);
        empArray[1] = new Employee("Yeltsyn Boris", "worker", "borisrazor@rambler.ru", 899900001, 14999, 78);
        empArray[2] = new Employee("Clinton Billy", "department head", "clinton@gmail.com", 899125125, 25999, 48);
        empArray[3] = new Employee("Lukashenko Leo", "agronomist", "mypotatoe@mail.ru", 892555215, 9999, 35);
        empArray[4] = new Employee("Pupkin Vasya", "CEO", "iamtheboss@gmail.com", 89999999, 99999, 25);

        for (Employee employee : empArray) {
            if (employee.getAge() > 40) {
                System.out.println(employee);
            }
        }
    }
}

