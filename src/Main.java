import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static boolean leapYear(int checkYear) {
        boolean currentYear = false;
        if (checkYear % 4 == 0 && checkYear % 100 != 0 || checkYear % 400 == 0) {
            currentYear = true;
        }
        return currentYear;
    }

    public static void task1() {
        System.out.println(" Задача 1");
        int year = 2022;
        leapYear(year);
        if (leapYear(year)) {
            System.out.println(year + " год является високосным");
            ;
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void printOsYear(int clientOs, int deviceYear) {
        int clientOpSyst = clientOs;
        int currentYear = LocalDate.now().getYear();
        if (clientOpSyst == 0 && deviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientOpSyst == 0 && deviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            if (clientOpSyst == 1 && deviceYear >= currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                if (clientOpSyst == 1 && deviceYear < currentYear) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
            }

        }
    }
    public static void task2 () {
        System.out.println(" Задача 2");
        int clientOs = 0;
        int deviceYear = 2016;
        printOsYear(clientOs, deviceYear);
    }
    public static void printDeliveryDays (int deliveryDistance) {
        int distance = deliveryDistance;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется 1 день.");
        } else {
            if (deliveryDistance > 100) {
                System.out.println("Доставки нет");
            } else {
                if (deliveryDistance >= 60) {
                    System.out.println("Потребуется 3 дня");
                } else {
                    if (deliveryDistance >= 20) {
                        System.out.println("Потребуется 2 дня");
                    }
                }
            }
        }
    }
    public static void task3() {
        System.out.println(" Задача 3");
        int deliveryDistance = 95;
        printDeliveryDays(deliveryDistance);
    }
}










