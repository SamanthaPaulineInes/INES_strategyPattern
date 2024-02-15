package StrategyPattern;

public class Spell implements AttackMode
{
    @Override
    public void attack()
    {
        System.out.println("     Wizard casts a spell!");
    }
}