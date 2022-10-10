package StrategyPattern.Robots;

import StrategyPattern.Behavior.MoveBehavior.IMoveBehavior;
import StrategyPattern.Behavior.SoundBehavior.IMakeSoundBehavior;

public abstract class Robot{
    public abstract void display();
    IMoveBehavior moveBehavior;
    IMakeSoundBehavior makeSoundBehavior;

    public Robot(IMoveBehavior moveBehavior, IMakeSoundBehavior makeSoundBehavior) { // like in unity
        this.moveBehavior = moveBehavior;
        this.makeSoundBehavior = makeSoundBehavior;
    }

    public void move(){
        this.moveBehavior.move();
    }

    public void sound(){
        this.makeSoundBehavior.sound();
    }
}
