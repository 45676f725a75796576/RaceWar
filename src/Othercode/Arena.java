package Othercode;

import java.util.Random;
import java.util.Scanner;

public class Arena extends Thread{
    Random r;
    Hero mainHero;
    Scanner scanner;
    public Arena(){
        scanner = new Scanner(System.in);
        r = new Random();
        mainHero = new Hero("Hero");
        mainHero.setConstitution(2);
        mainHero.setDexterity(2);
        mainHero.setIntelligence(2);
        mainHero.setStrength(2);
        mainHero = mainHero.heroBuilder("mage", "elf");
    }
    @Override
    public void run() {
        Hero enemy = new Hero("Enemy");
        int tmp = r.nextInt(5);
        String sr = "";
        String sc = "";
        switch (tmp){
            case 0 -> sr = "dark_elf";
            case 1 -> sr = "dwarf";
            case 2 -> sr = "elf";
            case 4 -> sr = "troll";
            case 5 -> sr = "undead";
            default -> sr = "human";
        }
        tmp = r.nextInt();
        switch (tmp){
            default -> sc = "knight";
            case 0 -> sc = "mage";
            case 1 -> sc = "ranger";
        }
        enemy.setDexterity(2);
        enemy.setConstitution(2);
        enemy.setIntelligence(2);
        enemy.setStrength(2);
        enemy = enemy.heroBuilder(sc, sr);
        enemy.xp = mainHero.level * 100;
        for (int i = 0; i < mainHero.level; i++) {
            enemy.LevelUp();
        }
        int r = Fight.fight(mainHero, enemy);
        if(r > 0) {
            mainHero.xp = r;
            mainHero.LevelUp();
        }
        else if (r < 0) {
            super.interrupt();
            System.out.println("Youre dead");
        }
        System.out.println("Do you want to save hero?");
        String answer = scanner.nextLine();
        answer = answer.toLowerCase();
        if(answer.equals("yes")) ReadWriteHero.write(mainHero);

    }
}
