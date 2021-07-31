package com.toadsdewin.mintic.Java.challengeONE;
import java.util.Scanner;

public class StudentRecord
{
    private static Scanner object = new Scanner(System.in);
    static Integer amount, i;

    public static void main(String args[])
    {
        System.out.print("Please write the amount of data: ");
        amount = object.nextInt();
        Integer array[] =  new Integer[amount];

        for(i=0; i<amount; i++)
        {
            System.out.print("Please write the data: ");
            array[i] = object.nextInt();
        }
        for (i=0; i<amount;i++)
        {
            System.out.println("Data: "+array[i]);
        }
    }
}