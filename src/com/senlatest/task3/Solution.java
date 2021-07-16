package com.senlatest.task3;
/*
На вход приходят 2 вектора, описанные координатами точек начала (x1,y1) и конца (x2,y2) вектора.
Найти длины векторов, а так же вектор произведения первого вектора на второй и второго на первый (получим 2 новых вектора).
 Векторы выводить в формате “начало (x1,y1), конец (x2,y2).

 */

public class Solution {
    public static void main(String[] args) {
        Vector a = new Vector(1,1);
        Vector b = new Vector(2,2);
        Vector c;
        c = a.vectorSum(a,b);
        System.out.println("Сумма векторов");
        c.getVector();
        System.out.println("Скалярное произведение векторов: "+a.scalMult(a,b));
    }
}
