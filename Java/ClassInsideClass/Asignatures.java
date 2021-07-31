package com.toadsdewin.mintic.Java.ClassInsideClass;
import java.util.ArrayList;

public class Asignatures
{
    private Integer codeCourse;
    private String nameCourse;
    private ArrayList<Student> arrayStudent;

    public Asignatures()
    {
        codeCourse = 001;
        nameCourse = "Philosophy";
        arrayStudent = new ArrayList<>();
    }
    public Asignatures(Integer codeCourse, String nameCourse)
    {
        this.codeCourse = codeCourse;
        this.nameCourse = nameCourse;
        arrayStudent = new ArrayList<>();
    }

    public Integer getCodeCourse()
    {
        return codeCourse;
    }
    public String getNameCourse()
    {
        return nameCourse;
    }
    public ArrayList<Student> getArrayStudent()
    {
        return arrayStudent;
    }

    public void addStudent(Student addStudent)
    {
        arrayStudent.add(addStudent);
    }

    @Override
    public String toString() {
        String text;
        text = "Asignatures {" +
                "codeCourse=" + codeCourse +
                ", nameCourse='" + nameCourse + '\'' +
                '}';
        for(Student myStudent: arrayStudent){
            text = text+" "+myStudent.getName()+" "+myStudent.getAge();
        }
        return text;
    }
}
