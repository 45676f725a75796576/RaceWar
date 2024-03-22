package Races;

public class Elf extends Race{
    public Elf(float strength, float dexterity, float constitution, float intelligence) {
        super(strength, dexterity * 1.04f, constitution, intelligence * 1.06f);
    }
}
