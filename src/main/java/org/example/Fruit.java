package org.example;

import org.springframework.stereotype.Component;


public class Fruit {
public  Fruit(){

    System.out.println("fruit无参构造函数");
}
void print_result(){
    System.out.println("水果");

    }

    @Override
    public String toString() {
        return "orange";
    }
}
