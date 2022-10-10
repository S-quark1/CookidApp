package StrategyPattern.Robots;

import StrategyPattern.Behavior.MoveBehavior.IMoveBehavior;
import StrategyPattern.Behavior.MoveBehavior.WalkBehavior;
import StrategyPattern.Behavior.SoundBehavior.IMakeSoundBehavior;
import StrategyPattern.Behavior.SoundBehavior.TalkBehavior;

public class MechanicRobot extends Robot {
    public MechanicRobot(IMoveBehavior moveBehavior, IMakeSoundBehavior makeSoundBehavior) {
        super(moveBehavior, makeSoundBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm a Mechanic Robot");
    }
}
