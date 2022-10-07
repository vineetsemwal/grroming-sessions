package com.example.demo.collection;

import java.util.Comparator;

public class Customer implements Comparable<Customer> {

    private int age;

    private String name;

    public Customer(String name, int age){
        this.age=age;
        this.name=name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Customer o) {
       int result= this.getAge()-o.getAge();
       return result;
    }
}
