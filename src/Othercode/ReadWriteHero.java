package Othercode;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ReadWriteHero {
    public static void write(Hero hero){
        try {
            PrintStream p  = new PrintStream("hero.txt");
            p.println("name="+hero.getName());
            p.println("xp="+hero.xp);
            p.println("level="+hero.level);
            p.println("race="+hero.getRace());
            p.println("class="+hero.get_class());
            p.println("strength="+hero.strength);
            p.println("intelligence="+hero.intelligence);
            p.println("constitution="+hero.constitution);
            p.println("dexterity"+hero.dexterity);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
