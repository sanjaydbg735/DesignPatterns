package StrategyPattern.Ducks;

import StrategyPattern.Fly.FlyNoWay;
import StrategyPattern.Quack.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("I'm a ModelDuck");
    }
}
