package Othercode;

import HeroClasses.*;
import Races.*;

public class Hero {
    private StandartClass _class;
    private Race race;
    private String name;
    protected float strength, dexterity, constitution, intelligence;
    protected int level;

    public Hero(String name, String heroClass, String heroRace){
        level = 1;
        this.name = name;
        Hero hero = heroBuilder(heroClass, heroRace);
        this.strength = hero.strength;
        this.dexterity = hero.dexterity;
        this.constitution = hero.constitution;
        this.intelligence = hero.intelligence;
        this.race = hero.race;
        this._class = hero._class;
    }

    private Hero(){}

    public Hero heroBuilder(String heroClass, String heroRace) {
        Hero hero = new Hero();
        switch (heroRace){
            default -> hero.race = new Human(strength, dexterity, constitution, intelligence);
            case "dark_elf" -> hero.race = new DarkElf(strength, dexterity, constitution, intelligence);
            case "dwarf" -> hero.race = new Dwarf(strength, dexterity, constitution, intelligence);
            case "elf" -> hero.race = new Elf(strength, dexterity, constitution, intelligence);
            case "troll" -> hero.race = new Troll(strength, dexterity, constitution, intelligence);
            case "undead" -> hero.race = new Undead(strength, dexterity, constitution, intelligence);
        }
        switch (heroClass){
            default -> hero._class = new Knight(strength, dexterity, constitution, intelligence);
            case "Mage" -> hero._class = new Mage(strength, dexterity, constitution, intelligence);
            case "Ranger" -> hero._class = new Ranger(strength, dexterity, constitution, intelligence);
        }

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
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void LevelUp()
    {

    }
}

