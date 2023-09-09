import Locations.*;
import Player.*;

import java.util.Scanner;

public class Game {
    private Scanner inp = new Scanner(System.in);
    private String playerName;

    public void start() {
        System.out.print("\nMacera oyununa hoş geldin. Kullanıcı adın: ");
        playerName = inp.next();
        System.out.println("Bu oyunda gerçek hayattaki korkularınızla yüzleşeceksiniz !!\n");

        System.out.println("Hangi karakter olmak istiyorsun? " + playerName);
        Player player = new Player(playerName);
        player.selectPlayer();

        Location location = null;

        while (true) {

            System.out.println("\n<-------------------------------| Mekanlar |------------------------------->");
            System.out.println("1 - Ev --> Burada dinlenebilirsin");
            System.out.println("2 - Market --> Buradan silah ve kalkan satın alabilirsiniz");
            System.out.println("3 - Mağara --> [Seviye 1] savaş alanı");
            System.out.println("4 - Orman --> [Seviye 2] savaş alanı");
            System.out.println("5 - Nehir --> [Seviye 3] savaş alanı");
            System.out.println("0 - Oyunu Bitir");
            System.out.println("X - Ödülleri Göster");
            System.out.println("<--------------| Durumunu kontrol etmek istiyorsan: Durum |------------>");
            System.out.print("Konum id gir: ");
            String selectLoc = inp.next();
            selectLoc = selectLoc.toUpperCase();

            switch (selectLoc) {
                case "0":
                    location = null;
                    break;
                case "1":
                    location = new House(player);
                    break;
                case "2":
                    location = new Store(player);
                    break;
                case "3":
                    location = new Cave(player);
                    break;
                case "4":
                    location = new Forest(player);
                    break;
                case "5":
                    location = new River(player);
                    break;
                case "DURUM":
                    player.showStatus();
                    continue;
                case "X":
                    player.awardStats();
                    continue;
                default:
                    location = new House(player);
            }

            if (location == null) {
                System.out.println("Oyunu korku içinde terk etmiş olsanız bile, bunun sadece bir oyun olduğunu ve güvenliğinizin her zaman önce geldiğini unutmayın.");
                System.out.println("Endişelenmeyin, bir şeyin size fazla geldiğini kabul etmekte utanılacak bir şey yok.");
                System.out.println("Kendinize iyi bakın ve güvende kalın!");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("OYUN BİTTİ..");
                break;
            }
        }
    }
}