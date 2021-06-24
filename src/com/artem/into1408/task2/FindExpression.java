package com.artem.into1408.task2;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class FindExpression {

    public static double FindingExpression(double x,  double y, double c){
        return (y + sqrt(y * y + 4 * x * c) / 2 * x) - (pow(x, 3) * c + (pow(y, -2)));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int c = s.nextInt();
        System.out.println(FindingExpression(x,y,c));
    }
}
