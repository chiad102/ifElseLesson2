public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Для вашей операционной системы приложения пока нет.");
        }


        int opSys = 1;
        int clientDeviceYear = 2014;
        switch (opSys) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Для вашей операционной системы приложения пока нет.");
        }


        int year = 2000;
        if ((year >= 1584) && (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("Указанный год является високосным");
        } else if (year % 400 == 0) {
            System.out.println("Указанный год является високосным");
        } else {
            System.out.println("Указанный год НЕ является високосным");
        }


        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        if ((deliveryDistance >= 20) && (deliveryDistance < 60)) {
            System.out.println("Потребуется дней: " + (deliveryDays + deliveryDays));
        }
        if ((deliveryDistance >= 60) && (deliveryDistance < 100)) {
            System.out.println("Потребуется дней: " + (deliveryDays + deliveryDays + deliveryDays));
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }


        int monthNumber = 14;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}