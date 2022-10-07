package com.example.demo.collection;

import java.util.Comparator;

public class AgeComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
     int result=c1.getAge()-c2.getAge();
     return result;

    }
}
