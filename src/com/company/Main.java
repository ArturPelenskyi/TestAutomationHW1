package com.company;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("a=");
        double a = in.nextDouble();
        System.out.print("b=");
        double b = in.nextDouble();
        System.out.print("c=");
        double c = in.nextDouble();
        System.out.print("x=");
        double x = in.nextDouble();
        System.out.print("y=");
        double y = in.nextDouble();

        in.close();

        if((a<=x && b<=y)||(a<=y && b<=x))
        {
            System.out.print("Просунути можна!");
        }
        else if ((a<=x && c<=y) || (a<=x && c<=y))
        {
            System.out.print("Просунути можна!");
        }
        else if ((b<=x && c<=y) || (b<=y && c<=x))
        {
            System.out.print("Просунути можна!");
        }
        else
        {
            System.out.print("Просунути неможна! ((");
        }


    }
}
