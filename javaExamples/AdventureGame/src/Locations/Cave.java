package Locations;
import Player.*;
import Obstacles.*;

public class Cave extends BattleLoc{

    public Cave(Player Player){
        super(Player,"Mağara",new Zombie(),"Yiyecek");
    }
}
