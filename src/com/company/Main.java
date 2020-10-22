package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input n:");
        int n = in.nextInt();
        int temp = (int) Math.pow(n,2);
        System.out.println("Квадрат n="+temp);
        String temp1 = Double.toString(temp);
        char[] ArrayTemp = temp1.toCharArray();
        String Messege = null;

        for (var i=0; i< ArrayTemp.length; i++)         // Перевірка чи квадрат n містисть цифру 3
        {
            if(ArrayTemp[i]=='3')
            {
                Messege = "Квадрат числа n містить цифру 3!";
                break;
            }
            else
            {
                Messege = "Квадрат числа n не містить цифру  3!";
            }
        }

        System.out.println(Messege);

        String N = Integer.toString(n); // Первід n в String


        char[] ArrayN = N.toCharArray(); // Запис кожної цифри запису числа n в масив сисмолів Array5

        System.out.println("Число n");

        for (int i=-0; i<ArrayN.length; i++)
        {
            System.out.print(ArrayN[i]);
        }

        System.out.println();


        for (int i = 0; i < ArrayN.length / 2; i++) { // Розворот числа n
            char tmp = ArrayN[i];
            ArrayN[i] = ArrayN[ArrayN.length - i - 1];
            ArrayN[ArrayN.length - i - 1] = tmp;
        }

        System.out.println("Розвернуте число n");

        for (int i=-0; i<ArrayN.length; i++)
        {
            System.out.print(ArrayN[i]);
        }

        for (int i = 0; i < ArrayN.length / 2; i++) { // Розворот щоб повенути n до початкового вигляду
            char tmp = ArrayN[i];
            ArrayN[i] = ArrayN[ArrayN.length - i - 1];
            ArrayN[ArrayN.length - i - 1] = tmp;
        }

        System.out.println();

        char Temp = ArrayN[0];
        ArrayN[0]=ArrayN[ArrayN.length-1];   // Заміна місцями крайніх чисел числа n
        ArrayN[ArrayN.length-1]= Temp;

        System.out.println("Число n з зміненими місцями крайніми числами");

        for (int i=-0; i<ArrayN.length; i++)
        {
            System.out.print(ArrayN[i]);
        }

        System.out.println();

        char[] ArrayNDefolt = N.toCharArray(); // Створення масиву де кожен елемент дорівнює відповідній цифрі запису числа n

        String strN = Arrays.toString(ArrayNDefolt);


        StringBuilder strBilder = new StringBuilder(strN);
        strBilder.insert(0,1);
        strBilder.insert(strBilder.length(),1);

        String NewStringN = strBilder.toString();

        char[] LastArray = NewStringN.toCharArray(); // Створення масиву де кожен елемент дорівнює відповідній цифрі запису чиса n до якого по краях добавили 1

        System.out.println("Чилсло n до якого по краях запису добавили 1");

        for(var i =0; i< LastArray.length; i++)
        {
            if (LastArray[i] == '0' || LastArray[i]=='1' || LastArray[i]=='2'||LastArray[i]=='3'||LastArray[i]=='4')
            {
                System.out.print(LastArray[i]);
            }
            else if (LastArray[i] == '5' || LastArray[i]=='6' || LastArray[i]=='7'||LastArray[i]=='8'||LastArray[i]=='9')
            {
                System.out.print(LastArray[i]);
            }
        }

    }
}
