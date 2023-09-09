package Locations;

import Obstacles.Obstacle;
import Player.Player;

import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private String name;
    private final int maxObstacles;

    public BattleLoc(Player Player, String name, Obstacle obstacle, String award) {
        super(Player, "Savaş Haritası", 10);
        this.obstacle = obstacle;
        this.name = name;
        this.award = award;
        this.maxObstacles = 3;
    }

    @Override
    public boolean onLocation() {
        int randomObstacle = randomObstacle();
        System.out.println("**********************************| " + this.getName() + " |**********************************");
        System.out.println("Savaşmak zorundasın " + randomObstacle + " " + this.getObstacle().getName());
        System.out.println("Eğer kazanırsan, kazanacaksın " + this.getAward());
        System.out.println("Savaşmak istiyor musun : Savaş/Koş");
        System.out.println("****************************************************************************");
        String selecetCase = inp.next();

        if (selecetCase.equals("SAVAŞ")) {
            if (combat(randomObstacle)) {
                System.out.println(this.getName() + " Tebrikler bu adımı geçtiniz.");
                return true;
            }
        }

        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("Öldün..!");
            return false;
        }
        return true;
    }

    public boolean combat(int obstacleNumber) {
        for (int i = 1; i <= obstacleNumber; i++) {
            this.getObstacle().setHealthy(this.getObstacle().getMainHealthy());
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealthy() > 0) {
                System.out.print("Vur/Kaç : ");
                String selectCombat = inp.next();
                if (selectCombat.equals("VUR")) {
                    this.getObstacle().setHealthy(this.getObstacle().getHealthy() - this.getPlayer().getDamage());
                    afterHit();
                    if (this.getObstacle().getHealthy() > 0) {
                        System.out.println();
                        System.out.println(this.getObstacle().getName() + " sana saldırdı !!");
                        int dodgeObstacle = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmorDefence();
                        System.out.println("-> " + this.getPlayer().getCharName() + " Sağlık : -" + this.getObstacle().getDamage());
                        if (dodgeObstacle < 0) {
                            dodgeObstacle = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - dodgeObstacle);
                        System.out.println(this.getPlayer().getCharName() + " Can Sağlığı : " + this.getPlayer().getHealth());
                        System.out.println("**************************************************************************");
                    }
                } else {
                    return false;
                }

                if (this.getObstacle().getHealthy() <= 0) {
                    System.out.println("[" + i + "" + this.getObstacle().getName() + "]");
                    System.out.println(this.getObstacle().getMoney() + " Kazanılan altın miktarı.!!");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getMoney());
                }

                if (i == obstacleNumber && this.getObstacle().getName().equals("Zombi")) {
                    this.getPlayer().getInventory().setWater(true);
                    System.out.println("Tebrikler, bir suyun var");
                }
                if (i == obstacleNumber && this.getObstacle().getName().equals("Vampir")) {
                    this.getPlayer().getInventory().setFood(true);
                    System.out.println("Tebrikler, bir yiyeceğin var");
                }
                if (i == obstacleNumber && this.getObstacle().getName().equals("Ayı")) {
                    this.getPlayer().getInventory().setFireWood(true);
                    System.out.println("Tebrikler, bir odunun var");
                }
            }
        }
        return false;
    }

    public void afterHit() {
        System.out.println("********************************| Başla |*********************************");
        System.out.println(this.getPlayer().getCharName() + " saldırıyor !!");
        System.out.println("-> " + this.getObstacle().getName() + " Sağlık : -" + this.getPlayer().getDamage());
        System.out.println(this.getObstacle().getName() + " Can Sağlığı : " + this.getObstacle().getHealthy());
        System.out.println();
    }

    public void playerStats() {
        System.out.println("**************************************************************************");
        System.out.println(this.getPlayer().getCharName() + " Durum ");
        System.out.println("[Hasar :" + this.getPlayer().getTotalDamage() +
                "] [Sağlık : " + this.getPlayer().getHealth() +
                "] [Silah : " + this.getPlayer().getInventory().getWeaponName() +
                "] [Silah Hasarı : " + this.getPlayer().getInventory().getWeaponDamage() +
                "] [Kalkan : " + this.getPlayer().getInventory().getArmorDefence() +
                "] [Altın :   " + this.getPlayer().getMoney() + "]");
    }

    public void obstacleStats(int i) {
        System.out.println(i + "." + this.getObstacle().getName() + " Durum ");
        System.out.println("[Hasar :" + this.getObstacle().getDamage() +
                "] [Sağlık :" + this.getObstacle().getHealthy() +
                "] [Ödül :" + this.getObstacle().getMoney() + " Altın]");
        System.out.println("**************************************************************************");
    }


    public int randomObstacle() {
        Random random = new Random();
        return random.nextInt(3) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getMaxObstacles() {
        return maxObstacles;
    }
}
