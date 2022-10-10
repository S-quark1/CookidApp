package StrategyPattern.Behavior.MoveBehavior;

public class WalkBehavior implements IMoveBehavior{
    @Override
    public void move() {
        System.out.println("Walking...");
    }
}
