package com.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public List<String> Table(int num){
        List<String>  table = new ArrayList<>();
        for(int i = 0; i < 11;  i++){
            table.add(num + " * " + i + " = " + (num * i));
        }
        return table;
    }
}
