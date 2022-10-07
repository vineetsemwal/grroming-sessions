package com.example.demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

    public static void main(String args[]){
        List<Customer> list=new ArrayList<>();
        list.add(new Customer("vijay",22));
        list.add(new Customer("pavan",21));
        list.add(new Customer("lakshmi",23));
       // Comparator<Customer>comparator=new AgeComparator();
        Comparator<Customer>comparator=new NameComparator();
        list.sort(comparator);
       // Collections.sort(list);

        for (Customer iterated:list){
            System.out.println("iterated="+iterated.getAge()+"-"+iterated.getName());
        }


    }
}
