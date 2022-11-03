package StrategyPattern.Robots;

import StrategyPattern.Behavior.MoveBehavior.IMoveBehavior;
import StrategyPattern.Behavior.SoundBehavior.IMakeSoundBehavior;

public class WoodenRobot extends Robot{
    public WoodenRobot(IMoveBehavior moveBehavior, IMakeSoundBehavior makeSoundBehavior) {
        super(moveBehavior, makeSoundBehavior);
    }

    @Override
    public String getName() {
        return "Wooden Robot";
    }

    @Override
    public void display() {
        System.out.println("yellow colored, wooden");
    }
}
