package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name = null;
    int age = 2;
    int weight = 2;
    String address = null;
    String color = "Black";

    public Cat(String name){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;
    }
    public Cat(String name, int weight,int age){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;
    }
    public Cat(String name, int age){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;
    }
    public Cat(int weight, String color){
        this.age=age;
        this.weight=weight;
        this.color=color;
    }
    public Cat(int weight, String color, String address){
        this.age=age;
        this.weight=weight;
        this.color=color;
        this.address=address;
    }


    public static void main(String[] args) {


    }
}
