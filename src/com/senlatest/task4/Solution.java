package com.senlatest.task4;
/*
Создать программу, которая будет вычислять и выводить на экран простые множители из которых состоит целое число,
введенное пользователем. Если введено не целое число, то сообщать ему об ошибке.

 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int i = 0;
        int a = 0;
        System.out.print ("Введите целое число: ");
        if (sc.hasNextInt()) { // возвращает истину если с потока ввода можно считать целое число
            i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            System.out.println ("Введите второе целое число: ");
            if (sc.hasNextInt()) {
                a = sc.nextInt();
                System.out.println (i + a);
            } else {
                System.out.println("Вы ввели не целое число");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
