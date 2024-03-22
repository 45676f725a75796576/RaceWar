package Races;

public class Human extends Race{
    public Human(float strength, float dexterity, float constituition, float intelligence){
        super(strength * 1.03f, dexterity * 1.04f, constituition, intelligence * 1.03f);
    }
}
