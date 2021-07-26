package com.toadsdewin.mintic;
import java.util.Scanner;

public class Repaso
{
    public static void main (String args [])
    {
        boolean exit = false;
        int opcion = 0;

        do {
            Scanner objeto = new Scanner(System.in);
            System.out.println("Please choose an option:\t");
            opcion = objeto.nextInt();

            switch(opcion)
            {
                case 0:
                    exit = true;
                    System.out.println("End of the program!");
                case 1:
                    System.out.println("This is the first choice");
                    break;
                case 2:
                    System.out.println("This is the second choice");
                    break;
                default:
                    System.out.println("Unavailable option!");
                    break;
            }
        }while(!exit);
    }

}
