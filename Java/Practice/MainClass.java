package com.toadsdewin.mintic.Java.Practice;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class MainClass
{
    static Football play;
    static Scanner object = new Scanner(System.in);
    static Teams addPlay = new Teams();

    public static void main(String args[])
    {
        System.out.print("Escriba el nombre del futbolista: ");
        String name = object.nextLine();

        System.out.print("Escriba la ciudad de nacimiento: ");
        String birth = object.nextLine();

        System.out.print("Escriba el año de nacimiento: ");
        Integer age = object.nextInt();

        System.out.print("Escriba la masa del jugador: ");
        Double weight = object.nextDouble();

        System.out.println("Escriba la altura del jugador: ");
        Double height =  object.nextDouble();

        System.out.println("Escrba el nombre del equipo: ");
        String nameTeam = object.nextLine();

        System.out.println("Escriba el año de fundación: ");
        Integer foundation = object.nextInt();

        System.out.println("Escriba la posición del jugador: ");
        String position = object.nextLine();

        play = new Football(name,birth,age,height,weight);
        Teams teams = new Teams(play,"Millonarios",1948,"Delantero");


        play.setBirthPlace(birth);
        play.setAgeBirth(age);
        play.setHeight(height);
        play.setWeight(weight);

        teams.setNameTeam(nameTeam);
        teams.setAgeFoundation(foundation);
        teams.setPositionPlayer(position);

        addPlay.addPlayer(play);

        //addPlay.getInfo();

        //System.out.println(teams);
        teams.getJugador();
        teams.getNameTeam();
        teams.getAgeFoundation();
        teams.getPositionPlayer();


    }

}
