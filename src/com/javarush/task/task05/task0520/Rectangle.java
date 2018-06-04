package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int top = 4;
    int left = 4;
    int width = 5;
    int height = 6;

    public Rectangle(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int left, int top){
        this.left = left;
        this.top = top;
    }

    public Rectangle(int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        height = width;
    }

    public Rectangle(Rectangle rectangle)
    {
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.height = rectangle.height;
        this.width = rectangle.width;
    }

    public static void main(String[] args) {

    }
}
