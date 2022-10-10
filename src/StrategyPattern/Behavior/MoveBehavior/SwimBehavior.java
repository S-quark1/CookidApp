package StrategyPattern.Behavior.MoveBehavior;

public class SwimBehavior implements IMoveBehavior{
    @Override
    public void move() {
        System.out.println("Swimming...");
    }
}
