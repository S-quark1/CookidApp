package StrategyPattern.Behavior.MoveBehavior;

public class DanceBehavior implements IMoveBehavior{
    @Override
    public void move() {
        System.out.println("Dancing...");
    }
}
