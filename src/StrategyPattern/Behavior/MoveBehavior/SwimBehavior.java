package StrategyPattern.Behavior.MoveBehavior;

public class SwimBehavior implements IMoveBehavior{
    @Override
    public String move() {
        return "Swimming...";
    }
}
