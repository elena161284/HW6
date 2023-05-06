import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {


        System.out.println();
            System.out.println("Задача 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();

            System.out.println("Задача 2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();

            System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();

            System.out.println("Задача 4");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println();

            System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4)
            if (i%4 ==0 && i%100!=0 || i%400==0){
            System.out.println(i + " год является високосным.");
        }
        System.out.println();

            System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();


            System.out.println("Задача 7");
        for (int i = 2; i <= 512; i = i * 2) {
            System.out.print(i + " " );
        }
        System.out.println();


            System.out.println("Задача 8");
        int accumulation = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i = i + 1) {
            total = total + accumulation;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей.");
        }
        System.out.println();

            System.out.println("Задача 9");
        int $ = 29000;
        double total1 = 0;
        int accumulationWithInterest = $ * 100;
        int totalWithInterest = 0;
        for (int i = 0; i <= 12; i = i + 1) {
            totalWithInterest = totalWithInterest + totalWithInterest / 100;
            totalWithInterest = totalWithInterest + accumulationWithInterest;
            total1 = totalWithInterest / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей.");
        }

        System.out.println();

            System.out.println("Задача 10");
        int number = 2;
        int composition = 0;
        for (int i = 0; i <= 10; i = i + 1) {
            composition = i * number;
            System.out.println(number + " * " + i + " = " + composition);
        }
    }
}


