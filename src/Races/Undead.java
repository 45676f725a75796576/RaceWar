package Races;

public class Undead extends Race{
    public Undead(float strength, float dexterity, float constitution, float intelligence) {
        super(strength, dexterity, constitution, intelligence * 1.1f);
    }
}
