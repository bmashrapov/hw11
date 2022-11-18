import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static final int CURRENT_YEAR = LocalDate.now().getYear();

    public static void printIsLeapYear(int year) {
        boolean leapYear = isLeapYear(year);
        printIsLeapYearResult(year, leapYear);
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsLeapYearResult(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не явялется високосным");
        }
    }

    public static void printAppInstallMessage(int clientOS, int clientDeviceYear) {
        boolean oldDevice = isOldDevice(clientDeviceYear);
        printAppInstallMessageResult(clientOS, oldDevice);
    }

    private static String defineClientOS(int clientOS) {
        if (clientOS == 0) {
            return "IOS";
        } else if (clientOS == 1) {
            return "Android";
        }
        return "вашей операционной системы";
    }

    private static boolean isOldDevice(int clientDeviceYear) {
        return clientDeviceYear < CURRENT_YEAR;
    }

    private static void printAppInstallMessageResult(int clientOS, boolean oldDevice) {
        if (oldDevice) {
            System.out.println("Установите lite-версию приложения для " + defineClientOS(clientOS) + " по ссылке");
        } else {
            System.out.println("Установите приложение для " + defineClientOS(clientOS) + " по ссылке");
        }
    }

    public static void printDeliveryDaysAmount(int deliveryDistance) {
        int deliveryDays = printDeliveryDaysAmountResult(deliveryDistance);
        if (deliveryDays == 0) {
            System.out.println("Приносим извинения. Доставка по этому адресу невозможна");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
    }

    private static int printDeliveryDaysAmountResult(int deliveryDistance) {
        int firstInterval = 20;
        int secondInterval = 60;
        int thirdInterval = 100;
        if (deliveryDistance < 0 || deliveryDistance > thirdInterval) {
            return 0;
        } else if (deliveryDistance < firstInterval) {
            return 1;
        } else if (deliveryDistance < secondInterval) {
            return 2;
        } else {
            return 3;
        }
    }
    public static void main(String[] args) {
        //ex1
        printIsLeapYear(2020);

        //ex 2
        printAppInstallMessage(0, 2020);
        //ex3
        printDeliveryDaysAmount(95);
    }
}
