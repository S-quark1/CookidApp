package StrategyPattern.Behavior.MoveBehavior;

public class NoMoveBehavior implements IMoveBehavior{
    @Override
    public String move() {
        return "No movement";
    }
}
