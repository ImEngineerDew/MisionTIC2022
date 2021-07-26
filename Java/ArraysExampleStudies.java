package com.toadsdewin.mintic;
import java.util.Scanner;

public class ArraysExampleStudies
{
    public static void main(String args[])
    {
        int arrList[ ],data,quantity,i;
        Scanner object = new Scanner(System.in);

        System.out.println("Please write the amount of data: ");
        quantity = object.nextInt();

        arrList = new int[quantity];

        System.out.println("Reading the amount of vectors: ");
        for(i=0; i<quantity;i++)
        {
            System.out.println("array["+i+"]"+"\t");
            arrList[i] = object.nextInt();
        }

        for(i=0; i<quantity; i++)
        {
            System.out.println("Vector "+i+" = "+arrList[i]);
        }
    }
}
