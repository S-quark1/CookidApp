package StrategyPattern.Robots;

import StrategyPattern.Behavior.MoveBehavior.IMoveBehavior;
import StrategyPattern.Behavior.SoundBehavior.IMakeSoundBehavior;

public class SwimmingRobot extends Robot{
    public SwimmingRobot(IMoveBehavior moveBehavior, IMakeSoundBehavior makeSoundBehavior) {
        super(moveBehavior, makeSoundBehavior);
    }

    @Override
    public String getName() {
        return "Swimming Robot";
    }

    @Override
    public String display() {
        return "blue colored, steel and plastic";
    }
}
