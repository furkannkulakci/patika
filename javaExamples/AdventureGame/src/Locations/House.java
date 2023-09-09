package Locations;

import Player.*;

public class House extends SafeLoc {

    public House(Player Player) {
        super(Player, "Ev", 1);
    }

    @Override
    public boolean onLocation() {
        System.out.println("-------------------------------| Ev |-------------------------------");
        System.out.println("Evim güzel evim :)");
        System.out.println(" -> Sağlık full.");
        System.out.println("----------------------------------------------------------------------");
        getPlayer().setHealth(this.getPlayer().getCharhealth());
        return true;
    }
}
