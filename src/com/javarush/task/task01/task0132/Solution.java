package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int i1 = number / 100;
        int number2Digit = number % 100;
        int i2 = number2Digit / 10;
        int i3 = number2Digit % 10;
        return (i1 + i2 + i3);
    }
}