import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static boolean isLeapYear (int year) {
        boolean leapYear;
        leapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
        return leapYear;
    }
    public static int getClientOS (String name){
        if (name.equals("IOS")){
            return 0;
        }return 1;
    }
    public static int getClientOSYear (int year) {
        int currentYear = LocalDate.now().getYear();
        if (year == currentYear) {
            return 0;
        }return 1;
    }
    public static int findDeliveryArea(int distance){
        if (distance < 20){
            return 1;
        }else if (distance >= 20 && distance < 60){
            return 2;
        } else if (distance>= 60 && distance <100) {
            return 3;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        //ex1
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = sc.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " год является высокосным");
        }else {
            System.out.println(year + " год не является високосным");
        }
        //ex 2
        String osName = "Android";
        int clientOS = getClientOS(osName);
        int clientOSYear = 2021;
        clientOSYear = getClientOSYear(clientOSYear);
        if (clientOS == 0 && clientOSYear == 0) {
            System.out.println("Установите наше приложение для IOS");
        }else if (clientOS == 0 && clientOSYear != 0) {
            System.out.println("Установите наше приложение lite для IOS");
        }else if (clientOS != 0 && clientOSYear == 0) {
            System.out.println("Установите наше приложение дляAndroid");
        }else if (clientOS != 0 && clientOSYear != 0) {
            System.out.println("Установите наше приложение lite для Android");
        }
        //ex3
        int deliveryDistance = 95;
        int deliveryArea = findDeliveryArea(deliveryDistance);
        int deliveryDays = 1;
        if (deliveryArea == 1) {
            deliveryDays = deliveryDays;
            System.out.println("Срок доставки " + deliveryDays + " дней");
        } else if (deliveryArea == 2) {
            deliveryDays += deliveryDays;
            System.out.println("Срок доставки " + deliveryDays + " дней");
        } else if (deliveryArea == 3) {
            deliveryDays +=  deliveryDays + 1;
            System.out.println("Срок доставки " + deliveryDays + " дней");
        } else {
            System.out.println("Мы не выполняем доставку дальше, чем на 100км");
        }
    }
}