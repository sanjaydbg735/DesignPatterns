package StrategyPattern.Ducks;

import StrategyPattern.Fly.FlyWithWings;
import StrategyPattern.Quack.Quack;

public class Mallard extends Duck {

    public Mallard() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("Mallard duck ...");
    }
}
