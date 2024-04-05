package Othercode;

import java.util.Random;

public class Fight {
    public static int fight(Hero hero1, Hero hero2) {
        Random r = new Random();
        while(hero2.getHealth() > 0 && hero1.getHealth() > 0){
            if(r.nextInt(12) > 6) hero2.setHealth((int) (hero2.getHealth() - hero2.get_class().getHit(hero1)));
            else hero1.setHealth((int) (hero1.getHealth() - hero1.get_class().getHit(hero2)));
        }
        if(hero1.getHealth() < 0) return hero2.level * 10;
        else return -1;
    }
}
