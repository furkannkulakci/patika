package Locations;
import Player.*;
import Obstacles.*;

public class Forest extends BattleLoc{
    public Forest(Player Player){
        super(Player,"Orman",new Vampire(),"Odun");
    }
}
