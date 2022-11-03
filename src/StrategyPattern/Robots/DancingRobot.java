package StrategyPattern.Robots;

import StrategyPattern.Behavior.MoveBehavior.IMoveBehavior;
import StrategyPattern.Behavior.SoundBehavior.IMakeSoundBehavior;

public class DancingRobot extends Robot{
    public DancingRobot(IMoveBehavior moveBehavior, IMakeSoundBehavior makeSoundBehavior) {
        super(moveBehavior, makeSoundBehavior);
    }

    @Override
    public String getName() {
        return "Dancing Robot";
    }

    @Override
    public void display() {
        System.out.println("pink colored, steel and plastic");
    }
}
