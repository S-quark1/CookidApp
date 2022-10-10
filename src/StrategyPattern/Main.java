package StrategyPattern;

import StrategyPattern.Behavior.MoveBehavior.IMoveBehavior;
import StrategyPattern.Behavior.MoveBehavior.SwimBehavior;
import StrategyPattern.Behavior.MoveBehavior.WalkBehavior;
import StrategyPattern.Behavior.SoundBehavior.IMakeSoundBehavior;
import StrategyPattern.Behavior.SoundBehavior.NoSoundBehavior;
import StrategyPattern.Behavior.SoundBehavior.TalkBehavior;
import StrategyPattern.Robots.MechanicRobot;
import StrategyPattern.Robots.Robot;
import StrategyPattern.Robots.SwimmingRobot;

public class Main {
    public static void main(String[] args) {
        IMakeSoundBehavior makeSoundBehavior = new NoSoundBehavior();
        IMoveBehavior moveBehavior = new SwimBehavior();
        Robot robot = new SwimmingRobot(moveBehavior, makeSoundBehavior);

        robot.move();
        robot.display();
        robot.sound();
    }
}
