package StrategyPattern.Robots;

import StrategyPattern.Behavior.MoveBehavior.IMoveBehavior;
import StrategyPattern.Behavior.SoundBehavior.IMakeSoundBehavior;

public class SpiderRobot extends Robot{
    public SpiderRobot(IMoveBehavior moveBehavior, IMakeSoundBehavior makeSoundBehavior) {
        super(moveBehavior, makeSoundBehavior);
    }

    @Override
    public String getName() {
        return "Spider Robot";
    }

    @Override
    public String display() {
        return "black colored, wool";
    }
}
