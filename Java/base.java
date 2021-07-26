package com.toadsdewin.mintic;
import java.util.Scanner;

public class base
{
    public static void main (String args[])
    {
        Scanner objeto = new Scanner(System.in);

        int numberOne, numberTwo;
        Integer result;


        System.out.println("Please type the first number: ");
        numberOne = objeto.nextInt();
        System.out.println("Please type the second number: ");
        numberTwo = objeto.nextInt();

        result = numberOne+numberTwo;

        System.out.println("The sum of both numbers is: "+result);
    }
}
