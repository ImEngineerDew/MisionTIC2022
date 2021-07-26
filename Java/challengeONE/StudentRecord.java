package com.toadsdewin.mintic.Java.challengeONE;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentRecord {
    static Scanner objeto = new Scanner(System.in);
    static int array[], suma = 0;
    static float average,sumatorias;

    static int quantityRead(int data) {
        array = new int[data];
        for (int i = 0; i < data; i++) {
            System.out.print("Position #" + i + ": ");
            array[i] = objeto.nextInt();
        }
        return data;
    }

    static void resultAverage(int data)
    {
        for (int j = 0; j < data; j++) {
            suma += array[j];
            //System.out.println("Position #"+j+": "+array[j]);
        }
        sumatorias = (float)suma;
        average = sumatorias/(float)data;
        System.out.println("Result: " + suma);
        System.out.println("Average: "+average);
    }

    public static void main(String args[]) {
        Integer  DNI;
        int dataOne;
        boolean flag;

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

                    flag = true;
                } else {
                    flag = true;
                    System.out.println("End of the program!");
                }
            } while (!flag);
        } catch (InputMismatchException exception) {
            System.out.println("Try Again!");
        }
    }
}



