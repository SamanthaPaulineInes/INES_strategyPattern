package StrategyPattern;

public class Barrier implements DefendMode
{
    @Override
    public void defend()
    {
        System.out.println("     Creating a magic barrier for defense!");
    }
}