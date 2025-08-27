package StrategyPattern;

import StrategyPattern.Ducks.Duck;
import StrategyPattern.Ducks.Mallard;
import StrategyPattern.Ducks.ModelDuck;
import StrategyPattern.Fly.FlyWithRocketPowered;

public class StrategyMain {
    public static void main(String[] args) {
        Duck mallardDuck = new Mallard();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyWithRocketPowered());
        model.performFly();
    }
}
