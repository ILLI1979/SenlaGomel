package com.senlatest.task1;

/*
Напишите программу, которая возвращает количество "троек" в заданной строке.
Тройка - это символ, появляющийся три раза подряд в строке.
 */

public class Solution
{
    public int noOfTriples(String string)
    {
        int l = string.length();
        int ctr = 0;
        for (int i = 0; i < l-2; i++)
        {
            char tmp = string.charAt(i);
            if (tmp == string.charAt(i+1) && tmp == string.charAt(i+2))
                ctr++;
        }
        return ctr;
    }
    public static void main (String[] args)
    {
        Solution m= new Solution();
        String string1 =  "helloooworldddd";
        System.out.println("The given string is: "+string1);
        System.out.println("The number of triples in the string is: "+m.noOfTriples(string1));
    }
}
