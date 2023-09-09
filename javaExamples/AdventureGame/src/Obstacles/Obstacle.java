package Obstacles;

public abstract class Obstacle {
    private String name;
    private int id;
    private int damage;
    private int healthy;
    private int mainHealthy;
    private int money;

    public Obstacle(String name, int id, int damage, int healthy, int money){
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.mainHealthy = healthy;
        this.healthy = healthy;
        this.money = money;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public int getDamage(){
        return damage;
    }
    public void setDamage(int damage){
        this.damage = damage;
    }

    public int getHealthy(){
        return healthy;
    }
    public void setHealthy(int healthy){
        this.healthy = healthy;
    }

    public int getMoney(){
        return money;
    }
    public void setMoney(int money){
        this.money = money;
    }

    public int getMainHealthy() {
        return mainHealthy;
    }

    public void setMainHealthy(int mainHealthy) {
        this.mainHealthy = mainHealthy;
    }
}
