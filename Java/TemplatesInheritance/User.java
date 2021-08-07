package com.toadsdewin.mintic.Java.TemplatesInheritance;
import java.util.ArrayList;

public class User
{
    protected String userName;
    protected String userType;
    protected Integer DNI;
    protected ArrayList <String> arrayRestrictions;

    public User()
    {
        arrayRestrictions = new ArrayList<>();
        userName = "Carlota";
        userType = "Student";
        DNI      = 870729110;
    }

    //Public the getters
    public String getUserName()
    {
        return userName;
    }
    public String getUserType()
    {
        return userType;
    }
    public Integer getDNI()
    {
        return DNI;
    }
    public ArrayList<String> obtenerPermisos()
    {
        return arrayRestrictions;
    }

    //Putting the setters
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public void setUserType(String userType)
    {
        this.userType = userType;
    }
    public void setDNI(Integer DNI)
    {
        this.DNI= DNI;
    }
    public void addingRestrictions() //A setter without setter
    {
        arrayRestrictions.add("Making a contract");
    }

}
