package StrategyPattern;

import StrategyPattern.Behavior.MoveBehavior.*;
import StrategyPattern.Behavior.SoundBehavior.*;
import StrategyPattern.Robots.*;

public class RobotAssembler {
    public Robot createDancing(){
        IMakeSoundBehavior makeSoundBehavior = new SingBehavior();
        IMoveBehavior moveBehavior = new DanceBehavior();
        return new DancingRobot(moveBehavior, makeSoundBehavior);
    }

    public Robot createMechanic(){
        IMakeSoundBehavior makeSoundBehavior = new TalkBehavior();
        IMoveBehavior moveBehavior = new WalkBehavior();
        return new MechanicRobot(moveBehavior, makeSoundBehavior);
    }

    public Robot createSpider(){
        IMakeSoundBehavior makeSoundBehavior = new NoSoundBehavior();
        IMoveBehavior moveBehavior = new CrawlBehavior();
        return new SpiderRobot(moveBehavior, makeSoundBehavior);
    }

    public Robot createSwimming(){
        IMakeSoundBehavior makeSoundBehavior = new NoSoundBehavior();
        IMoveBehavior moveBehavior = new SwimBehavior();
        return new SwimmingRobot(moveBehavior, makeSoundBehavior);
    }

    public Robot createToy(){
        IMakeSoundBehavior makeSoundBehavior = new SingBehavior();
        IMoveBehavior moveBehavior = new NoMoveBehavior();
        return new ToyRobot(moveBehavior, makeSoundBehavior);
    }

    public Robot createWooden(){
        IMakeSoundBehavior makeSoundBehavior = new NoSoundBehavior();
        IMoveBehavior moveBehavior = new NoMoveBehavior();
        return new WoodenRobot(moveBehavior, makeSoundBehavior);
    }
}
