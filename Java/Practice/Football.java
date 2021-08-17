package com.toadsdewin.mintic.Java.Practice;

public class Football
{
    private String name;
    private String birthPlace;
    private Integer ageBirth;
    private Double height;
    private Double weight;

    public Football()
    {
        name = "Radamel Falcao";
        birthPlace = "Santa Marta";
        ageBirth = 1986;
        height = 1.86;
        weight = 75.5;
    }

    public Football(String name, String birthPlace, Integer ageBirth, Double height, Double weight)
    {
        this.name = name;
        this.birthPlace = birthPlace;
        this.ageBirth = ageBirth;
        this.height = height;
        this.weight = weight;
    }

    public String getName()
    {
        return name;
    }
    public String getBirthPlace()
    {
        return birthPlace;
    }
    public Integer getAgeBirth()
    {
        return ageBirth;
    }
    public Double getHeight()
    {
        return height;
    }
    public Double getWeight()
    {
        return weight;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setBirthPlace(String birthPlace)
    {
        this.birthPlace = birthPlace;
    }
    public void setAgeBirth (Integer ageBirth)
    {
        this.ageBirth = ageBirth;
    }
    public void setHeight(Double height)
    {
        this.height = height;
    }
    public void setWeight(Double weight)
    {
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        String chain;

        chain = "Name:\t"+name+
                "\nBirthplace:\t"+birthPlace+
                "\nAge:\t"+ageBirth+
                "\nHeight:\t"+height+
                "\nWeight:\t"+weight;

        return chain;
    }

}
