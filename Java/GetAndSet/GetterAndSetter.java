package com.toadsdewin.mintic.Java.GetAndSet;

public class GetterAndSetter
{
    //This is an example about of getters and setters class
    private String nombre;
    private Double precio;

    public GetterAndSetter()
    {
        nombre = "Banana";
        precio = 4.50;
    }
    public GetterAndSetter(String nombre, Double precio)
    {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre()
    {
        return nombre;
    }
    public Double getPrecio()
    {
        return precio;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setPrecio(Double precio)
    {
        this.precio = precio;
    }
}
