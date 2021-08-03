package com.example.senlatest.task7;

import java.util.ArrayList;

/*
Есть набор предметов, задаётся заранее, предметы могут повторяться.
 Предмет имеет 2 параметра (обязательных, остальные на усмотрения, типа имя и т.д.),
 объём (целое значение) и ценность (целое значение). Предметы неделимы.
 Задаётся размер сейфа, параметром его объёма (целое значение).
Нужно написать программу, которая набивает сейф набором предметов,
 таким образом чтобы ценность этого набора была максимальной.

 */
public class Solution {
}

import java.util.ArrayList;

public class PackBag {

    public static void Pack(ArrayList<Integer> weights, ArrayList<Integer> costs, int capacity){

        int NB_ITEMS = weights.size();
        int[][] matrix = new int[NB_ITEMS + 1][capacity + 1];

        for (int i = 0; i <= capacity; i++)
            matrix[0][i] = 0;

        for (int i = 1; i <= NB_ITEMS; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (weights.get(i - 1) > j)
                    matrix[i][j] = matrix[i-1][j];
                else
                    matrix[i][j] = Math.max(matrix[i-1][j], matrix[i-1][j - weights.get(i-1)] +
                            costs.get(i-1));
            }
        }

        int res = matrix[NB_ITEMS][capacity];
        int w = capacity;
        ArrayList<Integer> weightsSolution = new ArrayList<>();
        ArrayList<Integer> costsSolution = new ArrayList<>();

        for (int i = NB_ITEMS; i > 0  &&  res > 0; i--) {
            if (res != matrix[i-1][w]) {
                weightsSolution.add(weights.get(i-1));
                costsSolution.add(costs.get(i-1));

                res -= costs.get(i-1);
                w -= weights.get(i-1);
            }
        }
        System.out.println("Include: ");
        for (int i = 0; i < weightsSolution.size(); i++){
            System.out.println( "Weight: " + weightsSolution.get(i) + "  Cost: " + costsSolution.get(i));
        }
        System.out.println();
    }
}
