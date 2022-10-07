package com.example.demo.collection;

import java.util.Comparator;

public class NameComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        int result=c1.getName().compareTo(c2.getName());
        return result;
    }
}
