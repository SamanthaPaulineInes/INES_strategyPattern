package StrategyPattern;

public class Shield implements DefendMode
{
    @Override
    public void defend()
    {
        System.out.println("     Using a shield to defend!");
        System.out.println("     Dodgin to avoid attack!");
        System.out.println("     Creating a magic barrier for defense!");
    }
}