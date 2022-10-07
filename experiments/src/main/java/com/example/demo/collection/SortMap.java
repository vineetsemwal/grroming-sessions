package com.example.demo.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortMap {
    public static void main(String[] args) {
        Comparator<String>keyComparator=new KeyComparator();
        Map<String, Customer> map = new TreeMap<>(keyComparator);
        Customer customer1 = new Customer("pavan", 21);
        Customer customer2 = new Customer("pankaj", 22);
        Customer customer3 = new Customer("arun", 23);
        map.put(customer1.getName(), customer1);
        map.put(customer2.getName(), customer2);
        map.put(customer3.getName(), customer3);
        Customer value = map.get("pankaj");
        System.out.println("customer fetched by key pankaj" + value.getName() + " " + value.getAge());
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Customer iteratedVal = map.get(key);
            System.out.println("key=" + key + " vaue=" + iteratedVal.getName() + "-" + iteratedVal.getAge());
        }
        //Collection<Customer>values=map
    }
}
