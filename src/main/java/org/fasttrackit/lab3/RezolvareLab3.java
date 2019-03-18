package org.fasttrackit.lab3;

import java.util.Scanner;

public class RezolvareLab3 {
    static int num1;
    static int num2;
    static int n;
    static int[] a;

    static double avg;
    static double avgall;
    static int sum;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        do {
            System.out.println("enter your number1");
            num1 = keyboard.nextInt();
        } while (num1<0);

        do {
            System.out.println("enter your number2");
            num2 = keyboard.nextInt();
        } while (num2<0);

        avg = (double)(num1+num2)/2;

        System.out.println("Average is: "+avg);


        System.out.println("enter all numbers:");
        n = keyboard.nextInt();
        int a[] = new int[n];
        for (int i=0; i<n; i++) {
            do {
                System.out.println("enter positive number for element "+(i+1));
                a[i]=keyboard.nextInt();
            } while (a[i]<0);

        }
        sum = 0;
        for (int i=0; i<n; i++) {
            sum = sum+a[i];

        }
        avgall =(double)sum/n;
        System.out.println("Average all is: "+avgall);











    }
}
