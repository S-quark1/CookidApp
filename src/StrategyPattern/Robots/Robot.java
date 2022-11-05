package StrategyPattern.Robots;

import StrategyPattern.Behavior.MoveBehavior.IMoveBehavior;
import StrategyPattern.Behavior.SoundBehavior.IMakeSoundBehavior;

public abstract class Robot{
    String name;
    IMoveBehavior moveBehavior;
    IMakeSoundBehavior makeSoundBehavior;

    public Robot(IMoveBehavior moveBehavior, IMakeSoundBehavior makeSoundBehavior) { // like in unity
        this.moveBehavior = moveBehavior;
        this.makeSoundBehavior = makeSoundBehavior;
    }

    public abstract String display();
    public abstract String getName();

    public String move(){
        return this.moveBehavior.move();
    }

    public String sound(){
        return this.makeSoundBehavior.sound();
    }
}
