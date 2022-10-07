package com.example.demo.collection;

import java.util.*;

public class SetSortDemo {
    public static void main(String args[]){
        // Comparator<Customer>comparator=new AgeComparator();
        Comparator<Customer> comparator=new NameComparator();
        Set<Customer> set=new TreeSet<>(comparator);
        set.add(new Customer("vijay",22));
        set.add(new Customer("pavan",21));
        set.add(new Customer("lakshmi",23));

        for (Customer iterated:set){
            System.out.println("iterated="+iterated.getAge()+"-"+iterated.getName());
        }

    }
}
