package com.company;

import java.util.Scanner;

public class Main {

    private static final double Pi =3.14;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input radius:");
        double radius = in.nextDouble();
        System.out.println("radius is "+radius);



        double area = Pi*Math.pow(radius,2); // Площа квітника.
        double perimeter = 2*Pi*radius; // Периметр квітника.

        System.out.println("Area of flower bed: "+area);
        System.out.println("perimeter of flower bed: "+perimeter);
    }
}

