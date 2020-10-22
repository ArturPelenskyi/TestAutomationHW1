package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What's your name ?");
        System.out.print("Input your name: ");
        String name = in.nextLine();
        System.out.println("Where do you  live? ");
        System.out.print("Input your address: ");
        String address =in.nextLine();
        System.out.print("Name is: "+name+" Address is: "+address);
        in.close();
    }
}
