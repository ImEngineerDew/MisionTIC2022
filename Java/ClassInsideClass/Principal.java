package com.toadsdewin.mintic.Java.ClassInsideClass;

import jdk.swing.interop.SwingInterOpUtils;

public class Principal
{
    public static void main(String[] args)
    {
        Student objCarlota = new Student("Carlota",34);
        Student objLaura   = new Student("Laura",26);
        Student objLuis    = new Student("Luis",26);
        Student objFernan  = new Student("Fernando", 30);

        Asignatures javaCourse = new Asignatures(001,"Java SE");
        Asignatures pythonCourse = new Asignatures(002,"Python 3.8");
        Asignatures businessAdmon = new Asignatures(003,"Business administration");

        javaCourse.addStudent(objLuis);
        javaCourse.addStudent(objFernan);

        pythonCourse.addStudent(objCarlota);

        businessAdmon.addStudent(objLaura);

        System.out.println(javaCourse.toString());
        System.out.println(pythonCourse.toString());
        System.out.println(businessAdmon.toString());

    }

}
