package com.example.demo.collection;

import java.util.Comparator;

public class KeyComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        int compare=str2.compareTo(str1);
        return compare;
    }
}
