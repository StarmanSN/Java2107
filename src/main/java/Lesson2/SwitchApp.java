package Lesson2;

public class SwitchApp {

    public static void main(String[] args) {
        printMonthName(2);
        printMonthNameIf(22);
        printTimeOfTheYear("December");
        printTimeOfTheYear("May");

    }
    /**
     * Напечатает название месяца или скажет что такого нет.
     * JavaDoc
     */
    public static void printMonthNameIf(int monthNumber){
        if(monthNumber == 1){
            System.out.println("January");
        } else if(monthNumber == 2){
            System.out.println("February");
            /// ...
        } else {
            System.out.println("No such month");
        }

    }

    public static void printMonthName(int monthNumber) {
        switch (monthNumber){
            case 1: {
                System.out.println("January");
                break;
            }
            case 2: {
                System.out.println("February");
                break;
            }
            /// ...
            default:
                System.out.println("No such month");
        }
    }
    public static void printTimeOfTheYear(String monthName){
        switch (monthName){
            case "December":
            case "January":
            case "February": {
                System.out.println("Winter");
                break;
            }
            case "March":
            case "April":
            case "May": {
                System.out.println("Spring");
                break;
            }
            default:
                System.out.println("No such time of the year");
        }
    }
}
