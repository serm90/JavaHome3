package com.company;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public abstract class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        try {
            System.out.println("Выбери тип фигуры: 1 - квадрат; 2 - прямоугольник; 3 - круг; 4 - промоугольный треугольник ");
            int num = a.nextInt();

            {
                switch (num) {
                    case (1): {
                        Scanner a1 = new Scanner(System.in);
                        System.out.println("Введите длинну стороны квадрата");
                        double num1 = a1.nextDouble();
                        Square square = new Square(num1);
//                        System.out.println(square.area());
//                        System.out.println(square.perimeter());
                    }
                    case (2): {

                    }
//                    Scanner a1 = new Scanner(System.in);
//                    System.out.println("Введите длинну стороны квадрата");
//                    int num1 = a1.nextInt();
//                    double s1 = num1 * num1;
//                    System.out.println("Площадь квадрата: " + s1);
//                    double p1 = num1 * 4;
//                    System.out.println("Периметр квадрата: " + p1);
//                    break;
                }
            }

        } catch (Exception ex) {
            System.out.println("Площадь квадрат: ");
        }
    }


}

