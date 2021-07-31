package com.toadsdewin.mintic.Java.Motorcycle;
import java.util.ArrayList;

public class Principal
{
    private static ArrayList <Moto> miArregloMotos = new ArrayList<>();
    public static void main(String args[])
    {
        Moto yamaha = new Moto("Yamaha",2021);
        Moto suzuki = new Moto("Suzuki",2020);
        miArregloMotos.add(yamaha);
        miArregloMotos.add(suzuki);

        for(Moto myValue: miArregloMotos)
        {
            System.out.print("Marca: "+myValue.getBrand());
            System.out.println("\tModel: "+myValue.getModel());
        }
    }

}
