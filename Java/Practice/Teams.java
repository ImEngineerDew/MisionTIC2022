package com.toadsdewin.mintic.Java.Practice;

public class Teams extends Football implements AddPlayer
{
    protected Football jugador;
    private String nameTeam;
    private Integer ageFoundation;
    private String positionPlayer;

    public Teams()
    {
        super();
        nameTeam = "Millonarios";
        ageFoundation = 1946;
        positionPlayer = "Defensa";
    }
    public Teams(Football jugador,String nameTeam, Integer ageFoundation,String positionPlayer)
    {
        super();
        this.jugador = jugador;
        this.nameTeam = nameTeam;
        this.ageFoundation = ageFoundation;
        this.positionPlayer = positionPlayer;
    }
    
    public String getNameTeam()
    {
        return nameTeam;
    }
    public Integer getAgeFoundation()
    {
        return ageFoundation;
    }
    public String getPositionPlayer()
    {
        return positionPlayer;
    }
    public Football getJugador()
    {
        return jugador;
    }

    public void setNameTeam(String nameTeam)
    {
        this.nameTeam = nameTeam;
    }
    public void setAgeFoundation(Integer ageFoundation)
    {
        this.ageFoundation = ageFoundation;
    }
    public void setPositionPlayer(String positionPlayer)
    {
        this.positionPlayer = positionPlayer;
    }
    public void setJugador(Football jugador)
    {
        this.jugador = jugador;
    }
    @Override
    public void addPlayer(Football playKind)
    {
        player.add(playKind);
    }

    public void getInfo()
    {
        for (Football myPlayer: player )
        {
            System.out.println("Name:\t"+myPlayer.getName());
            System.out.println("Age of birth:\t"+myPlayer.getAgeBirth());
            System.out.println("Place of birth:\t"+myPlayer.getBirthPlace());
        }
    }

}
