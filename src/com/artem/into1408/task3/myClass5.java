package com.artem.into1408.task3;

public class myClass5 {

    public static double swapNumber(double x) {
        return (x * 1000) % 1000 + (int) x / 1000.0;
    }

    public static void main(String[] args) {
        double x = 123.547;
        System.out.println(swapNumber(x));
    }
}
