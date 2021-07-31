package com.toadsdewin.mintic.Java.challengeONE;
import java.util.Scanner;

public class StudentRecord
{
    private static Scanner object = new Scanner(System.in);
    static Integer i ,sum = 0;
    static Double average, array[];

    static double quantityOfData(Integer amount)
    {
        array = new Double[amount];
        System.out.println("Size of the array: "+amount);
        for (i=0; i<amount; i++)
        {
            System.out.print("Data of the position # "+i+": ");
            array[i] = object.nextDouble();
        }
        return amount;
    }

    public static void main(String args[])
    {
        double sumatory = 0;

        sumatory = (double)sum;
        System.out.print("Please write the amount of data: ");
        Integer amnt = object.nextInt();

        quantityOfData(amnt);

        for (int j=0; j<amnt;j++)
        {
            sumatory+=array[j];
            average = sumatory/amnt;
        }
        System.out.println("Sum: "+sumatory);
        System.out.print("Average: "+average);
    }
}