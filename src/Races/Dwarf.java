package Races;

public class Dwarf extends Race{
    public Dwarf(float strength, float dexterity, float constitution, float intelligence) {
        super( strength * 1.07f, dexterity, constitution * 1.03f, intelligence);
    }

    @Override
    public String toString() {
        return "dwarf";
    }
}
