package Locations;

import Obstacles.Bear;
import Player.*;


public class River extends BattleLoc {
    public River(Player Player) {
        super(Player, "Nehir", new Bear(), "Su");
    }
}
