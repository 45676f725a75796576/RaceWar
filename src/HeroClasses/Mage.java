package HeroClasses;

public class Mage extends StandartClass{
    public Mage(float strength, float dexterity, float constitution, float intelligence) {
        super(strength, dexterity, constitution, intelligence + 3);
    }

    @Override
    public float AttackStrength() {
        return 3 * super.intelligence;
    }

    @Override
    public String toString() {
        return "mage";
    }
}
