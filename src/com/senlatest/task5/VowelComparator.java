package com.senlatest.task5;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VowelComparator implements Comparator<StringBuffer> {
    @Override
    public int compare(StringBuffer o1, StringBuffer o2) {
        return numberOFVowels(o1) - numberOFVowels(o2);
    }
    private static int numberOFVowels(StringBuffer S) {
        int num = 0;
        Pattern p = Pattern.compile("[уеёыаоэюия]");
        Matcher m = p.matcher(S);
        while (m.find()) {
            num++;
        }
        return num;
    }

}
