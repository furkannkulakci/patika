package Locations;

import Player.*;

public abstract class SafeLoc extends Location {

    SafeLoc(Player Player, String name, int id) {
        super(Player, name, 4);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
