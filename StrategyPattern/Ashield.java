package StrategyPattern;

public class Ashield implements DefendMode
{
    @Override
    public void defend()
    {
        System.out.println("     Using a shield to defend!");
    }
}