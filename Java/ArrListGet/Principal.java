package com.toadsdewin.mintic.Java.ArrListGet;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Principal
{
    public static final Scanner object = new Scanner(System.in);
    public static Integer value;

    public static void main(String[] args)
    {
        ArrayGetAndSet number = new ArrayGetAndSet();
        Boolean letsGo = true;

        while(letsGo)
        {
            System.out.print("Write your data: ");
            value = object.nextInt();
            if(value>0)
            {
                number.agregarValor(value);
            }
            else
            {
                letsGo = false;
                System.out.println("Hasta la vista, baby!");
            }
        }
        number.getArray();
    }
}
