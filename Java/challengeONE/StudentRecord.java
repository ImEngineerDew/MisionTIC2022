package com.toadsdewin.mintic.Java.challengeONE;
import java.util.Scanner;

public class StudentRecord
{
    private static Scanner object = new Scanner(System.in);
    static Integer array[],i,amount,sum = 0;
    static Double average;

    static double quantityOfData(Integer amount)
    {
        array = new Integer[amount];
        System.out.println("Size of the array: "+amount);
        for (i=0; i<amount; i++)
        {
            System.out.print("Data of the position"+i+": ");
            array[i] = object.nextInt();
        }
        return amount;
    }

    public static void main(String args[])
    {
        System.out.print("Please write the amount of data: ");
        Integer amnt = object.nextInt();

        quantityOfData(amnt);

        for (int j=0; j<amnt;j++)
        {
            sum+=array[j];
            double resultSum = (double)sum;
            average = resultSum/amnt;
        }
        System.out.println("Sum: "+sum);
        System.out.print("Average: "+average);
    }
}