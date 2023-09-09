package Locations;

import Market.*;
import Player.Player;

public class Store extends Location {

    public Store(Player Player) {
        super(Player, "Market", 2);
    }

    @Override
    public boolean onLocation() {

        System.out.println("\nMAĞAZAYA HOŞGELDİN !");

        System.out.println("-------------------------------| MAĞAZA |-------------------------------");
        System.out.println("1 - Silah satın al");
        System.out.println("2 - Kalkan satın al");
        System.out.println("3 - Çıkış");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Id Gir: ");
        int selectGun = inp.nextInt();
        while (selectGun < 1 || 3 < selectGun) {
            System.out.println("Yanlış giriş yaptın lütfen tekrar dene: ");
            selectGun = inp.nextInt();
        }
        switch (selectGun) {
            case 1:
                printWeapon();
                break;
            case 2:
                printShield();
                break;
            default:
                System.out.println("Görüşmek üzere..");
        }
        return true;
    }

    public void printWeapon() {

        Weapons[] gunList = {new Pistol(), new Rifle(), new Sword()};

        System.out.println("--------------------------------| Silahlar |---------------------------------");
        for (Weapons weapons : gunList) {
            System.out.println("Silah " + weapons.getId() + ": " + weapons.getName() + " | " +
                    " Fiyat" + ": " + weapons.getCost() + " | " +
                    " Hasar" + ": " + weapons.getDamage());
        }
        System.out.println("4 - Çıkış");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Silahını Seç : ");
        int buyGun = inp.nextInt();
        while (buyGun < 1 || 3 < buyGun) {
            if (buyGun == 4) {
                break;
            } else System.out.println("Yanlış giriş yaptın lütfen tekrar dene: ");
            buyGun = inp.nextInt();
        }
        buyWeaponById(buyGun);
    }

    public void printShield() {

        Shield[] shieldList = {new Helmet(), new Armor(), new Protection()};

        System.out.println("--------------------------------| Kalkanlar |---------------------------------");
        for (Shield shield : shieldList) {
            System.out.println("Kalkan " + shield.getId() + ": " + shield.getName() + " | " +
                    " Fiyat" + ": " + shield.getCost() + " | " +
                    " Kaçınma" + ": " + shield.getDodge());
        }
        System.out.println("4 - Çıkış");
        System.out.println("----------------------------------------------------------------------------");
        System.out.print("Kalkanını seç : ");
        int buyShield = inp.nextInt();
        while (buyShield < 1 || 3 < buyShield) {
            if (buyShield == 4) {
                break;
            } else System.out.println("Yanlış giriş yaptın lütfen tekrar dene: ");
            buyShield = inp.nextInt();
        }
        buyShieldById(buyShield);
    }


    public void buyWeaponById(int id) {
        Weapons[] weapons = {new Pistol(), new Rifle(), new Sword()};
        for (Weapons weapon : weapons) {
            if (weapon.getId() == id) {
                int cost = weapon.getCost();
                if (this.getPlayer().getMoney() >= cost) {
                    int balance = getPlayer().getMoney() - cost;
                    this.getPlayer().setMoney(balance);
                    System.out.println("Satın aldın " + weapon.getName() + "!");
                    this.getPlayer().getInventory().setWeaponName(weapon.getName());
                    this.getPlayer().getInventory().setWeaponDamage(weapon.getDamage());
                    return;
                } else {
                    System.out.println(weapon.getName());
                    System.out.println("Bu silahı almak için yeterli paran yok..");
                    return;
                }
            }
        }
        System.out.println("Geçersiz silah ID'si.");
    }

    public void buyShieldById(int id) {
        Shield[] shieldList = {new Helmet(), new Armor(), new Protection()};
        for (Shield shield : shieldList) {
            if (shield.getId() == id) {
                int cost = shield.getCost();
                if (this.getPlayer().getMoney() >= cost) {
                    int balance = getPlayer().getMoney() - cost;
                    this.getPlayer().setMoney(balance);
                    System.out.println("Satın aldın " + shield.getName() + "!");
                    this.getPlayer().getInventory().setArmorName(shield.getName());
                    this.getPlayer().getInventory().setArmorDefence(shield.getDodge());
                    return;
                } else {
                    System.out.println(shield.getName());
                    System.out.println("Bu kalkanı almak için yeterli paran yok..");
                    return;
                }
            }
        }
        System.out.println("Geçersiz kalkan ID'si.");
    }
}
