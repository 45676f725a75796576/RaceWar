package HeroClasses;

public class Knight extends StandartClass{
    public Knight(float strength, float dexterity, float constitution, float intelligence) {
        super(strength + 3, dexterity, constitution, intelligence);
    }

    @Override
    public float AttackStrength() {
        return 3 * super.AttackStrength();
    }

    @Override
    public String toString() {
        return "knight";
    }
}
