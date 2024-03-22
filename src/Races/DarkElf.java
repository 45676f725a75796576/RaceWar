package Races;

public class DarkElf extends Race{
    public DarkElf(float strength, float dexterity, float constitution, float intelligence) {
        super(strength, dexterity * 1.06f, constitution, intelligence * 1.04f);
    }
}
