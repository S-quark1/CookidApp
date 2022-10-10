package StrategyPattern.Behavior.MoveBehavior;

public class NoMoveBehavior implements IMoveBehavior{
    @Override
    public void move() {
        System.out.println("No movement");
    }
}
