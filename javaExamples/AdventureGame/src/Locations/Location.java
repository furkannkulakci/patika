package Locations;

import Player.Player;

import java.util.Scanner;

public abstract class Location {
    protected Scanner inp = new Scanner(System.in);
    private Player Player;
    private String name;
    private boolean isWin = false;
    private int id;

    public Location(Player Player, String name, int id) {
        this.Player = Player;
        this.name = name;
        this.id = id;
        this.isWin = false;
    }

    public abstract boolean onLocation();

    public Player getPlayer() {
        return Player;
    }

    public void setPlayer(Player Player) {
        this.Player = Player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWin() {
        return isWin;
    }

    public void setWin(boolean win) {
        isWin = win;
    }
}