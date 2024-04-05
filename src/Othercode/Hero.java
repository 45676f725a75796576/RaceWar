package Othercode;

import HeroClasses.*;
import Races.*;

import java.util.Random;

public class Hero {
    private StandartClass _class;
    private Race race;
    private String name;
    protected float strength, dexterity, constitution, intelligence;
    protected int level;
    protected int health;
    protected int xp;

    public Hero(String name){
        level = 1;
        health = level * 10;
        this.name = name;
    }

    private Hero(){}

    public Hero heroBuilder(String heroClass, String heroRace) {
        Hero hero = new Hero();
        switch (heroRace){
            default: hero.setRace(new Human(strength, dexterity, constitution, intelligence));
            case "dark_elf": hero.setRace(new DarkElf(strength, dexterity, constitution, intelligence));
            case "dwarf": hero.setRace(new Dwarf(strength, dexterity, constitution, intelligence));
            case "elf": hero.setRace(new Elf(strength, dexterity, constitution, intelligence));
            case "troll": hero.race = new Troll(strength, dexterity, constitution, intelligence);
            case "undead": hero.race = new Undead(strength, dexterity, constitution, intelligence);
        }
        switch (heroClass){
            default -> hero._class = new Knight(strength, dexterity, constitution, intelligence);
            case "mage" -> hero._class = new Mage(strength, dexterity, constitution, intelligence);
            case "ranger" -> hero._class = new Ranger(strength, dexterity, constitution, intelligence);
        }
        this.strength = hero.strength;
        this.dexterity = hero.dexterity;
        this.constitution = hero.constitution;
        this.intelligence = hero.intelligence;
        this.race = hero.race;
        this._class = hero._class;

        return hero;
    }

    public StandartClass get_class() {
        return _class;
    }

    public void set_class(StandartClass _class) {
        this._class = _class;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
        strength = race.getStrength();
        dexterity = race.getDexterity();
        constitution = race.getConstitution();
        intelligence = race.getIntelligence();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void LevelUp()
    {
        if(xp > 100 * level) {
            level++;
            health = level * 10;
            Random r = new Random();
            int tmp = 0;
            for (int i = 0; i < 3; i++) {
                tmp = r.nextInt(3);
                switch (tmp){
                    case 0: strength++;
                    case 1: dexterity++;
                    case 2: constitution++;
                    case 3: intelligence++;
                }
            }
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(float strength) {
        this.strength = strength;
    }

    public void setDexterity(float dexterity) {
        this.dexterity = dexterity;
    }

    public void setConstitution(float constitution) {
        this.constitution = constitution;
    }

    public void setIntelligence(float intelligence) {
        this.intelligence = intelligence;
    }

}

