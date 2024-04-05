package HeroClasses;

public class Ranger extends StandartClass{
    public Ranger(float strength, float dexterity, float constitution, float intelligence) {
        super(strength, dexterity + 3, constitution, intelligence);
    }

    @Override
    public float AttackStrength() {
        return 3 * super.dexterity;
    }

    @Override
    public String toString() {
        return "ranger";
    }
}
