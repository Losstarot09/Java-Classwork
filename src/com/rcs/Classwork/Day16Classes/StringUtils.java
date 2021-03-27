package com.rcs.Classwork.Day16Classes;

public class StringUtils {

    public static String getMiddle(String text) {
        if (text.length()%2 == 0) {
            int middleEnd = text.length() / 2 + 1;
            int middleStart = middleEnd - 2;
            return text.substring(middleStart, middleEnd);
        } else {
            return text.substring(text.length() / 2, (text.length() / 2) + 1);
        }
    }
}
