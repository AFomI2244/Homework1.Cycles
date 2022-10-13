public class Main {
    public static void main(String[] args) {
        //Домашнее задание - 1. Циклы. Часть 1
        //Задание 1
        System.out.println("Домашнее задание - 1. Циклы. Часть 1");
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Число " + i); //Все числа от 1 до 10 по порядку
        }

        //Задание 2
        System.out.println("Задание 2");
        for (int a = 10; a >= 1; a--) {
            System.out.println("Число " + a); //Все числа от 10 до 1 в обратном порядке
        }

        //Задание 3
        System.out.println("Задание 3");
        for (int b = 0; b <= 17; b++) {
            if (b % 2 == 0) {
                System.out.println("Число " + b + " - четное"); //Все ЧЕТНЫЕ числа от 0 до 17
            }
        }

        //Задание 4
        System.out.println("Задание 4");
        for (int c = 10; c >= -10; c--) {
            System.out.println("Число " + c); //Все числа от 10 до -10, от бОльшего к меньшему
        }

        //Домашнее задание - 2. Циклы. Часть 1
        //Задание 1

        System.out.println("Домашнее задание - 2. Циклы. Часть 1");
        System.out.println("Задание 1");
        for (int y = 1904; y <= 2096; y = y + 4) {
            System.out.println(y + " год является високосным");
        }

        //Задание 2
        System.out.println("Задание 2");
        for (int d = 7; d <= 98; d = d + 7) {
            System.out.print(d + " "); // Последовательнось чисел от 7 до 98 (с шагом = 7)
        }
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        for (int e = 1; e <= 512; e = e * 2) {
            System.out.print(e + " "); //Последовательность чисел от 1 до 512 (с шагом = х*2)
        }
        System.out.println();

        //Домашнее задание - 3. Циклы. Часть 1
        //Задание 1

        System.out.println("Домашнее задание - 3. Циклы. Часть 1");
        System.out.println("Задание 1");
        int monthlyAmount = 29000;
        int total = 0;
        for (int f = 1; f <= 12; f++) {
            total = total + monthlyAmount;
            System.out.println("Месяц " + f + ", сумма накоплений равна " + total + " рублей");
        }

        //Задание 2
        System.out.println("Задание 2");
        int month = 29000;
        int Total = 0;
        for (int g = 1; g <= 12; g++) {
            Total = Total + Total/100;
            Total = Total + month;
            System.out.println("Месяц " + g + ", сумма накоплений равна " + Total + " рублей");
        }

    }
}