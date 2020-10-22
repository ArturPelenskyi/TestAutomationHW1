package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input tariff for the first country: ");
        double c1 = in.nextDouble();
        System.out.print("Input tariff for thr second country: ");
        double c2 = in.nextDouble();
        System.out.print("Input tariff for thr third country: ");
        double c3 = in.nextDouble();
        System.out.println("Tariff for the  first country: "+ c1 +" for the second: "+ c2 +" for the  third: "+c3);

        System.out.print("Input time of the first talk: ");
        double t1 = in.nextDouble();
        System.out.print("Input time of the second talk: ");
        double t2 = in.nextDouble();
        System.out.print("Input time of the third talk: ");
        double t3 = in.nextDouble();
        System.out.println("Time of the first talk: "+ t1 +" of the second: "+ t2 +" of the third: "+t3);
        in.close();

        double countForTheFirstTalk = c1*t1;
        double countForTheSecondTalk = c2*t2;
        double countForTheThirdTalk = c3*t3;

        double countForAllTalks = countForTheFirstTalk+countForTheSecondTalk+countForTheThirdTalk;

        System.out.println("Count for the first talk: "+countForTheFirstTalk);
        System.out.println("Count for the second talk: "+countForTheSecondTalk);
        System.out.println("Count for the third talk: "+countForTheThirdTalk);

        System.out.println("Count for all talks: "+countForAllTalks);




    }
}
