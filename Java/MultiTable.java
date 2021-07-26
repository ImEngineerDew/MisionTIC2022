package com.toadsdewin.mintic;
import java.util.Scanner;

public class MultiTable
{
    public static void main(String args [])
    {
        int producto, start, end;
        Scanner objeto = new Scanner(System.in);

        System.out.println("¿Que producto desea realizar el producto?: ");
        producto = objeto.nextInt();

        System.out.println("Punto de inicio: ");
        start = objeto.nextInt();

        System.out.println("Punto final: ");
        end = objeto.nextInt();

        for (int i =start; i<=end; i++)
        {
            int resultado = producto*i;
            System.out.println(producto+"X"+i+"="+resultado);
        }
    }
}
