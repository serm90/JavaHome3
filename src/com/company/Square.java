package com.company;

import java.util.Scanner;

public class Square implements Calculation {

   double num;
    double s;
    double p;
//                       System.out.println("Площадь квадрата: " + s1);
    @Override
    public double perimeter() {
        return p = num * 4;
    }

    @Override
    public double area() {
        s = num*num;
        System.out.println(s);
        return s;
    }

    public Square(double num) {
        this.num = num;
    }
}
