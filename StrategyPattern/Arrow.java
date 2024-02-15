package StrategyPattern;

public class Arrow implements AttackMode
{
    @Override
    public void attack()
    {
        System.out.println("     Archer shoots an arrow!");
    }
}