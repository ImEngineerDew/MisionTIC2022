package com.toadsdewin.mintic.Java.ArrListGet;
import java.util.ArrayList;

public class ArrayGetAndSet
{
    //1. Properties
    private ArrayList <Integer> myArray;

    public ArrayGetAndSet()
    {
        myArray = new ArrayList<>();
    }
    public void agregarValor(int datoExterno) // is that an setter??
    {
        myArray.add(datoExterno);
    }

    public ArrayList  getArray()
    {
        for(Integer myValue: myArray)
        {
            System.out.println("Data: "+myValue);
        }
        return myArray;
    }


}
