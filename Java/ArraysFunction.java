package com.toadsdewin.mintic;
import java.util.Scanner;

public class ArraysFunction
{
    static Scanner objeto = new Scanner(System.in);
    static Integer array[][];

    public static void main(String[] args)
    {
        int row,columns;

        System.out.println("Quantity of rows: ");
        row = objeto.nextInt();

        System.out.println("Quantity of columns: ");
        columns = objeto.nextInt();

        //array = new Integer[row][columns];
        leerDatos(row,columns);
        mostrarDatos(row,columns);
    }

    static void leerDatos(int rw, int col)
    {
        int i, j;
        //rw = array.length;
        //col = array[0].length;

        array = new Integer[rw][col];
        for(i=0; i<rw; i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print("array["+i+"]"+"["+j+"]");
                array[i][j] = objeto.nextInt();
            }
        }
    }

    static void mostrarDatos(int rw,int col)
    {
        int i, j;
        rw = array.length;
        col = array[0].length;

        //array = new Integer[rw][col];
        for(i=0; i<rw;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(" "+array[i][j]);
            }
            System.out.println(" ");
        }

    }

}
