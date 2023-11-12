package org.example.classes;

import java.util.Locale;

public class StringUtils {
    public static boolean included(String word, String searched) {
        if(word.toUpperCase().contains(searched.toUpperCase().trim())) {
            return true;
        }
        return false;
    }
}
