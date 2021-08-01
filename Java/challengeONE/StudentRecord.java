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
            System.out.print("Record # "+i+": ");
            array[i] = object.nextDouble();
        }
        return amount;
    }

    public static void main(String args[])
    {
        double sumatory = 0;
        Boolean flag = false;

        sumatory = (double)sum;

        System.out.print("Please type your DNI: ");
        Integer DNI = object.nextInt();

        do {
            if(DNI>0)
            {
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
                break;
            }
            else
            {
                flag= false;
                System.out.println("This program has been ended!");
            }
        }while(flag);
   }
}