package com.toadsdewin.mintic.Java.challengeONE;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentRecord
{
    static Scanner objeto = new Scanner(System.in);
    static double array[], suma = 0;
    static float average,sumatorias,dataAmount;

    static double quantityRead(int data) {
        array = new double[data];
        for (int i = 0; i < data; i++) {
            System.out.print("Position #" + i + ": ");
            array[i] = objeto.nextDouble();
        }
        return data;
    }

    static void resultAverage(int data)
    {
        for (int j = 0; j < data; j++) {
            suma += array[j];
        }
        sumatorias = (float)suma;
        dataAmount = (float)data;

        average = sumatorias/dataAmount;

        System.out.println("Result: " +sumatorias);
        System.out.println("Average: "+average);
    }

    public static void main(String args[]) {
        Integer  DNI,dataOne;
        boolean flag = true;

        try {
            do {
                System.out.print("Please write your DNI: ");
                DNI = objeto.nextInt();

                if (DNI != 0) {
                    System.out.print("Please write the amount of data: ");
                    dataOne = objeto.nextInt();

                    System.out.println("Reading the amount of vectors: ");
                    quantityRead(dataOne);

                    System.out.println("DNI: " + DNI);
                    resultAverage(dataOne);
                    break;
                } else {
                    flag = true;
                    System.out.println("End of the program!");
                }
            } while (flag);
        } catch (InputMismatchException exception) {
            System.out.println("Try Again!");
        }
    }
}



