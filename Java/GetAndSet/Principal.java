package com.toadsdewin.mintic.Java.GetAndSet;
import java.util.Scanner;

public class Principal
{
    private static Scanner object = new Scanner(System.in);

    public static void main(String args[])
    {
        GetterAndSetter restoran = new GetterAndSetter();
        GetterAndSetter empanada = new GetterAndSetter("Empanada",3.50);

        System.out.print("Write your food: ");
        String food = object.nextLine();
        System.out.print("Write the price of the "+food+": ");
        Double prize =  object.nextDouble();

        restoran.setNombre(food);
        restoran.setPrecio(prize);

        System.out.println("Name: "+restoran.getNombre());
        System.out.println("Price: "+restoran.getPrecio()+" euros");

        System.out.println("Name: "+empanada.getNombre());
        System.out.println("Price: "+empanada.getPrecio()+" euros");

        restoran.toString();
    }
}
