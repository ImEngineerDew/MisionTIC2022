package com.toadsdewin.mintic.Java.Motorcycle;

public class Moto
{
    private String brand;
    private Integer model;

    public Moto()
    {
        brand = "Honda";
        model = 2008;
    }

    public Moto(String brand, Integer model)
    {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand()
    {
        return brand;
    }
    public Integer getModel()
    {
        return model;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }
    public void setModel(Integer model)
    {
        this.model = model;
    }

}
