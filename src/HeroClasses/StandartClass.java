package HeroClasses;

import Othercode.Hero;

public class StandartClass {
    protected float strength, dexterity, constitution, intelligence;

    public StandartClass(float strength, float dexterity, float constitution, float intelligence) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
    }
    public float AttackStrength(){
        return strength;
    }

    public float getHit(Hero sourceEntity) {
        float tmp;
        if (sourceEntity.get_class() instanceof Mage) tmp = sourceEntity.get_class().AttackStrength() - intelligence - constitution;
        else if (sourceEntity.get_class() instanceof Ranger) tmp = sourceEntity.get_class().AttackStrength() - dexterity - constitution;
        else tmp = sourceEntity.get_class().AttackStrength() - strength - constitution;
        if(tmp < 0) tmp = 0;
        return tmp;
    }
}
