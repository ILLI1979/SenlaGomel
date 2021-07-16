package com.senlatest.task2;
/*
Напишите программу, которая возвращает сумму цифр, присутствующих в данной строке.
 Если цифр нет, возвращаемая сумма равна 0.

 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();
        System.out.print("Input second number: ");
        int num2 = in.nextInt();
        System.out.print("Input third number: ");
        int num3 = in.nextInt();
        System.out.println(num1 + " + " + num2 + " + " + num3 + " =" +
                (num1 + num2 + num3));

    }
}