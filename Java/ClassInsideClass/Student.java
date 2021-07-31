package com.toadsdewin.mintic.Java.ClassInsideClass;

public class Student 
{
    private String name;
    private Integer age;

    public Student()
    {
        name = "Carlota Manrique";
        age  = 34;
    }
    public Student(String na, Integer ag)
    {
        this.name = na;
        this.age  = ag;
    }

    public String getName()
    {
        return name;
    }
    public Integer getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(Integer age)
    {
        this.age = age;
    }

}
