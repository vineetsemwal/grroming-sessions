package com.example.demo.generics;

public class StoreMain {

    public static void main(String args[]) {
        Store<Integer> store = new Store<>();
        store.add(10);
        Integer found = store.getValue();
        System.out.println("found="+found);
    }

}
