package com.example.demo.generics;

public class Store <T>{
    private T value;

    public void add(T e){
        this.value=e;
     }

    public T getValue(){
        return value;
    }


}
