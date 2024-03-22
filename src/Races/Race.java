package Races;

public class Race {
    protected float strength, dexterity, constitution, intelligence;

    public Race(float strength, float dexterity, float constitution, float intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
    }

    public float getStrength() {
        return strength;
    }

    public float getDexterity() {
        return dexterity;
    }

    public float getConstitution() {
        return constitution;
    }

    public float getIntelligence() {
        return intelligence;
    }
}
