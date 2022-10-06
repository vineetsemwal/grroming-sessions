package com.example.demo.colection;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("hello");
        list.add("bye");
        String e1 = list.get(1);
        list.remove("hi");
        System.out.println("size="+list.size());
        for(String iterated:list){
            System.out.println("iterated="+iterated);
        }
        boolean exists=list.contains("bye");
    }
}
